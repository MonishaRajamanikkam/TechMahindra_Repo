package libraryManagement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LibraryManager extends LibrarySystem {
    private Lock lock = new ReentrantLock();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void borrowBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException {
        lock.lock();
        try {
            User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst().orElseThrow(() -> new UserNotFoundException("User not found!"));
            Book book = books.stream().filter(b -> b.getISBN().equals(ISBN) && !b.isBorrowed()).findFirst().orElseThrow(() -> new BookNotFoundException("Book not available!"));

            if (user.getBorrowedBooks().size() >= 3) {
                throw new MaxBooksAllowedException("User has already borrowed maximum books!");
            }

            book.borrow();
            user.borrowBook(book);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void returnBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException {
        lock.lock();
        try {
            User user = users.stream().filter(u -> u.getUserID().equals(userID)).findFirst().orElseThrow(() -> new UserNotFoundException("User not found!"));
            Book book = user.getBorrowedBooks().stream().filter(b -> b.getISBN().equals(ISBN)).findFirst().orElseThrow(() -> new BookNotFoundException("Book not found with user!"));

            book.returnBook();
            user.returnBook(book);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Book searchBook(String title) {
        return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
}



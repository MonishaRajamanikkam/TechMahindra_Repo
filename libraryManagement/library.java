package libraryManagement;

public interface library {
	    void borrowBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException;
	    void returnBook(String ISBN, String userID) throws BookNotFoundException, UserNotFoundException;
	    Book searchBook(String title);
	}



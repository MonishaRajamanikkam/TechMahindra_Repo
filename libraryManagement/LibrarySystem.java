package libraryManagement;
	import java.util.List;
	import java.util.ArrayList;

	public abstract class LibrarySystem implements library {
	    protected List<Book> books = new ArrayList<>();
	    protected List<User> users = new ArrayList<>();

	    public abstract void addBook(Book book);
	    public abstract void addUser(User user);
	}



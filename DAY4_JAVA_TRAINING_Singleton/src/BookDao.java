import java.util.List;

public interface BookDao {
	public List<Book> getAllBooks();
	public Book getBookById(int bookId);
	public void addBook(Book book);
	public void updateBook(Book book);
	public void removeBook(Book book);
}

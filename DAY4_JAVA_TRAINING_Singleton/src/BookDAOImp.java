import java.util.List;
import java.sql.*;

public class BookDAOImp implements BookDao{
	
	Connection con;
	public BookDAOImp(Connection con){
		this.con = con;
	}
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:/JAVATRAINING","root","root");
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from Book");
			 while(rs.next()){
				 System.out.print(rs.getInt("id"+" "));
				 System.out.print(rs.getString("isbn"+" "));
				 System.out.print(rs.getString("title"+" "));
				 System.out.print(rs.getString("author"+" "));
				 System.out.print(rs.getInt("Price"+" "));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		//con = DriverManager.getConnection("jdbc:mysql:://localhost:8080/JAVATRAINING","root","faheemali");
		//PrepareStatement stmt = con.prepareStatement("insert into Book values(author,isbn,price,title)");
		//stmt;
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBook(Book book) {
		// TODO Auto-generated method stub
		
	}
	
		
}

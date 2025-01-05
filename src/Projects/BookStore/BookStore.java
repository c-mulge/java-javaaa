package Projects.BookStore;

import java.sql.*;
import java.util.Scanner;
import java.lang.*;

public class BookStore {
//    private final String jdbcURL="jdbc:mysql://localhost:3306/BookStoreDB";
    String driver="com.mysql.cj.jdbc.Driver";
    String dburl="jdbc:mysql://localhost:3306/bookstoredb";
//    Class.forName(driver); //is used to dynamically load the MySQL JDBC driver at runtime.
//    Connection conn= DriverManager.getConnection(dburl,userName,password);
    private Connection connect() throws SQLException{
        return DriverManager.getConnection(dburl,"root","Channu@123");
    }

//    private ArrayList<Book> books =new ArrayList<>();
//    private ArrayList<Customer> customers=new ArrayList<>();
//    private int bookIdCounter=1;
//    private int customerIdCounter=1;

    public void addBook(Scanner sc){
        System.out.print("Enter Book title: ");
        String title=sc.nextLine();
        System.out.print("Enter Book author: ");
        String author=sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price=sc.nextDouble();
        String sql="Insert into book(title, author, price)values(?,?,?)";
        try(Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
            System.out.println("Book added Successfully>");
        }catch(SQLException e){
            e.printStackTrace();
        }
//        books.add(new Book(bookIdCounter++,title,author,price));
//        System.out.println("Book added successfully.");
    }

    public void viewBook(){
//        if(books.isEmpty()){
//            System.out.println("No Books available.");
//        }else{
//            books.forEach(System.out::println);
//        }
        String sql="Select * from book";
        try(Connection conn=connect();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql)){
            while(rs.next()){
                System.out.println("Book ID: "+rs.getInt("id")+", Title: "+rs.getString("title")+", Author: "+rs.getString("author")+", Price: $"+rs.getDouble("price"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteBook(Scanner sc){
        System.out.print("Enter Book ID to delete: ");
        int id=sc.nextInt();
//        books.removeIf(book->book.getId()==id);
//        System.out.println("Book deleted successfully (if it existed).");
        String sql="Delete from books where id=?";
        try(Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setInt(1,id);
            int rowsAffected=pstmt.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Book deleted successfully");
            }else{
                System.out.println("No book found with given ID.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void addCustomer(Scanner sc){
        System.out.print("Enter customer name: ");
        String name=sc.nextLine();
//        customers.add(new Customer(customerIdCounter++, name));
//        System.out.println("Customer added successfully.");
        String sql="Insert into customers(name)values(?)";
        try(Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            System.out.println("Customer added Successfully>");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void viewCustomers(){
//        if(customers.isEmpty()){
//            System.out.println("No customers available.");
//        }else{
//            customers.forEach(System.out::println);
//        }
        String sql="Select * from customers";
        try(Connection conn=connect();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql)){
            while(rs.next()){
                System.out.println("Customer ID: "+rs.getInt("id")+", Name: "+rs.getString("name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void purchaseBook(Scanner sc){
        System.out.print("Enter customer ID: ");
        int customerID=sc.nextInt();
        System.out.print("Enter book ID: ");
        int bookID=sc.nextInt();
//        Customer customer=customers.stream().filter(c->c.getId()==customerID).findFirst().orElse(null);
//        Book book=books.stream().filter(b->b.getId()==bookID).findFirst().orElse(null);

//        if(customer==null){
//            System.out.println("Invalid Customer ID");
//            return;
//        }
//        if(book==null){
//            System.out.println("Invalid Book ID.");
//            return;
//        }
//        System.out.println("Purchase successful!");
//        System.out.println("Customer: "+customer.getName());
//        System.out.println("Book: "+book.getTitle()+" by "+book.getAuthor()+ " - $"+book.getPrice());
        String sql="INSERT INTO purchases(customer_id,book_id) VALUES(?,?)";
        try(Connection conn=connect();
            PreparedStatement pstmt=conn.prepareStatement(sql)){
            pstmt.setInt(1,customerID);
            pstmt.setInt(2, bookID);
            pstmt.executeUpdate();
            System.out.println("Purchase recorded Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

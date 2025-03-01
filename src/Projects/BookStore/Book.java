package Projects.BookStore;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id,String title, String author, double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        return "Book Id: "+id+", Title: "+title+", Author: "+author+", Price: "+price;
    }
}

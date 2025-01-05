package Projects.BookStore;
import java.util.ArrayList;
import java.util.Scanner;

public class BookStoreApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStore store=new BookStore();
        while(true){
            System.out.println("\n======Book Store Menu======");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Add Customer");
            System.out.println("5. View Customer");
            System.out.println("6. Purchase Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> store.addBook(sc);
                case 2 -> store.viewBook();
                case 3 -> store.deleteBook(sc);
                case 4 -> store.addCustomer(sc);
                case 5 -> store.viewCustomers();
                case 6 -> store.purchaseBook(sc);
                case 7 -> {
                    System.out.println("Exiting Book Store App. GoodBye!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

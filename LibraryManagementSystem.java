// Import necessary packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class to represent book objects
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter method for book title
    public String getTitle() {
        return title;
    }

    // Override toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Main class for the library management system
public class LibraryManagementSystem {
    // Main method
    public static void main(String[] args) {
        // Initialize a list to store book objects
        List<Book> library = new ArrayList<>();
        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Main loop to display menu options and get user input
        while (true) {
            // Display menu options
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");

            // Get user choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                // Option 1: Add a book
                System.out.println("Enter book title:");
                String title = scanner.nextLine();
                System.out.println("Enter book author:");
                String author = scanner.nextLine();
                System.out.println("Enter book ISBN:");
                String isbn = scanner.nextLine();

                // Create a new book object and add it to the list
                library.add(new Book(title, author, isbn));
                System.out.println("Book added successfully");
            } else if (choice == 2) {
                // Option 2: Search for a book by title
                System.out.println("Enter book title to search:");
                String title = scanner.nextLine();

                // Search for the book in the list and display details if found
                boolean found = false;
                for (Book book : library) {
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        System.out.println(book);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    // If the book is not found, notify the user
                    System.out.println("Book not found");
                }
            } else if (choice == 3) {
                // Option 3: Display all books in the library
                for (Book book : library) {
                    System.out.println(book);
                }
            } else if (choice == 4) {
                // Option 4: Exit the program
                System.out.println("Exiting the program...");
                break;
            } else {
                // Handle invalid menu choices
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

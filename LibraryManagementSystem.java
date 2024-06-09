import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    // List to store book objects
    private static List<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
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
                addBook();
            } else if (choice == 2) {
                searchBook();
            } else if (choice == 3) {
                displayAllBooks();
            } else if (choice == 4) {
                // Exit the program
                break;
            } else {
                // Handle invalid choices
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Method to add a new book to the library
    private static void addBook() {
        // Prompt for book details
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter book author:");
        String author = scanner.nextLine();
        System.out.println("Enter book ISBN:");
        String isbn = scanner.nextLine();

        // Create and add book to the list
        library.add(new Book(title, author, isbn));
        System.out.println("Book added successfully");
    }

    // Method to search for a book by title
    private static void searchBook() {
        // Prompt for book title to search
        System.out.println("Enter book title to search:");
        String title = scanner.nextLine();

        // Search and display book details if found
        boolean found = false;
        for (Book book : library) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }

    // Method to display all books in the library
    private static void displayAllBooks() {
        if (library.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            // Display each book's details
            for (Book book : library) {
                System.out.println(book);
            }
        }
    }
}

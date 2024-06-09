public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the Book object
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Overriding toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

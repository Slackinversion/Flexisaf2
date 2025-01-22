
import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    // Constructor to initialize Book attributes
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display book details
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

class BookCollection {
    ArrayList<Book> books = new ArrayList<>(); // List to store books

    // Method to add a book
    void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added successfully.");
    }

    // Method to remove a book by ISBN
    void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isbn.equals(isbn)) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Adding books
        collection.addBook("Java Basics", "John Doe", "12345");
        collection.addBook("Advanced Java", "Jane Smith", "67890");

        // Displaying books
        collection.displayBooks();

        // Removing a book
        collection.removeBook("12345");

        // Displaying books after removal
        collection.displayBooks();
    }
}

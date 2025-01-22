import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;

    
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter Option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) { 
                System.out.print("Enter title: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String isbn = scanner.nextLine();
                books.add(new Book(title, author, isbn));
                System.out.println("Book added!");

            } else if (choice == 2) { // Remove a book
                System.out.print("Enter ISBN of the book to remove: ");
                String isbn = scanner.nextLine();
                boolean found = false;

                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).isbn.equals(isbn)) {
                        books.remove(i);
                        System.out.println("Book removed!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No book found with that ISBN.");
                }

            } else if (choice == 3) { 
                if (books.isEmpty()) {
                    System.out.println("No books in the library.");
                } else {
                    System.out.println("Books in the library:");
                    for (Book book : books) {
                        book.displayBook();
                    }
                }

            } else if (choice == 4) { // Exit
                System.out.println("Exiting the program. Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

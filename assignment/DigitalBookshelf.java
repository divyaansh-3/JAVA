import java.util.*;

class Book {
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b.isbn + " | " + b.title + " | " + b.author +
                    " | Available: " + b.isAvailable);
        }
    }

    void displayAvailableBooks() {
        for (Book b : books) {
            if (b.isAvailable) {
                System.out.println(b.isbn + " | " + b.title);
            }
        }
    }

    void borrowBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                if (b.isAvailable) {
                    b.isAvailable = false;
                    System.out.println("Success!");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                b.isAvailable = true;
                System.out.println("Book returned.");
                return;
            }
        }
    }
}

public class DigitalBookshelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Default books
        lib.addBook(new Book("978-01", "Java Basics", "James", true));
        lib.addBook(new Book("978-02", "DBMS", "Korth", true));
        lib.addBook(new Book("978-03", "OS", "Galvin", true));

        while (true) {
            System.out.println("\n1. View All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    lib.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    lib.borrowBook(isbn);
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
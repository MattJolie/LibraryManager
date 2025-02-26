// Tester code provided by Pawan Gupta

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new DigitalBook("Java Programming", "John Doe", "1234", true, "PDF");
        Book book2 = new PhysicalBook("Design Patterns", "Jane Smith", "5678", true, 1.5);

        // Manually add books to the library
        library.addBook(book1, 0);
        library.addBook(book2, 1);

        // Create a member
        LibraryMember member = new LibraryMember("Alice", 101, 0);
        library.addMember(member, 0);

        // Borrow a book
        library.borrowBook(101, "1234");
        //library.borrowBook(101,"1234");
        //library.borrowBook(101,"random");
        //library.borrowBook(200,"1234");

        // Display library info after a book is borrowed
        library.displayLibraryInfo();

        // Return a book
        library.returnBook(101, "1234");

        // Display library info
        library.displayLibraryInfo();
    }
}
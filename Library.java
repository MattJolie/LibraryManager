/*********************************************
 * Author: Matt Jolie
 *
 * This class defines a library, with books and members
 *
 * There is one constructor, which creates an empty library
 *
 * Adding books and members both have their own methods
 *
 * There are also methods to have a user borrow/return a book,
 * as well as printing out the members and books that are in the library
 ********************************************/

public class Library {
    // Attributes
    private Book[] books = new Book[5];
    private LibraryMember[] members = new LibraryMember[5];

    // default constructor
    public Library(){}

    // adding a book to the library
    public void addBook(Book book, int index){
        books[index] = book;
    }

    // adding a member to the library{
    public void addMember(LibraryMember member, int index){
       members[index] = member;
       //System.out.println("Member was added successfully");
    }

    // having a specific user borrow a book
    public void borrowBook(int memberID, String ISBN){
        LibraryMember borrower = null;
        Book borrowed = null;
        for (int i = 0; i < members.length; i++){
            if (members[i] == null){
                break;
            }
            else if (members[i].getID() == memberID){
                borrower = members[i];
                break;
            }
        }
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                break;
            }
            else if (books[i].getISBN().equalsIgnoreCase(ISBN)){
                borrowed = books[i];
                break;
            }
        }
        // Make sure the book and member both exist
        if (borrower != null && borrowed != null){
            borrower.borrowBook(borrowed);
        }
        else{
            System.out.println("An error occurred with borrowing this book. Make sure the member and book have been added to the library.");
        }
    }

    // having a specific user return a book{
    public void returnBook(int memberID, String ISBN){
        LibraryMember borrower = null;
        Book borrowed = null;
        for (int i = 0; i < members.length; i++){
            if (members[i].getID() == memberID){
                borrower = members[i];
                break;
            }
        }
        for (int i = 0; i < books.length; i++){
            if (books[i].getISBN().equalsIgnoreCase(ISBN)){
                borrowed = books[i];
                break;
            }
        }
        // Make sure the book and member both exist
        if (borrower != null && borrowed != null){
            borrower.returnBook(borrowed);
        }
        else{
            System.out.println("An error occurred with returning this book. Make sure the member and book have been added to the library.");
        }
    }

    // print out information about the library
    public void displayLibraryInfo(){
        System.out.println("Members:");
        for (int i = 0; i < members.length; i++){
            if (members[i] == null){
                break;
            }
            members[i].displayMemberInfo();
        }
        System.out.println("Books:");
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){
                break;
            }
            books[i].printDetails();
        }
    }

}

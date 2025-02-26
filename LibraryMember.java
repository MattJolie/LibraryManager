/*********************************************
 * Author: Matt Jolie
 * This class defines a Library Member, with attributes
 * name, memberID, and the number of books they have borrowed
 *
 * There is a constructor to make a new member based on their
 * name and memberID, with a default borrow count of 0
 *
 * There are functions to borrow a book, return a book,
 * get a member's ID, and print the member's details
 ********************************************/

public class LibraryMember {
    // attributes of a library member
    private String name;
    private int memberID;
    private int booksBorrowed;

    // constructor
    public LibraryMember(String name, int memberID, int booksBorrowed){
        this.name = name;
        this.memberID = memberID;
        this.booksBorrowed = booksBorrowed;
    }

    // getter method for member ID
    public int getID(){
        return memberID;
    }

    // borrow a book
    public void borrowBook(Book book){
        if(book.borrowBook()){
            booksBorrowed++;
        }
    }

    // return a book
    public void returnBook(Book book){
        book.returnBook();
        booksBorrowed--;
    }

    // show member details
    public void displayMemberInfo(){
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("# of books borrowed: " + booksBorrowed);
        System.out.println();
    }
}

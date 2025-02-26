/***************************************************
 * Author: Matt Jolie
 * This class defines a Book object with a title, author, and ISBN
 * The Book also has a status of whether it is available
 *
 * The class includes a constructor, and check-in/out methods,
 * as well as methods to get a Book's ISBN and to print the details of a Book
 **************************************************/

public class Book {
    // attributes of a book
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String ISBN, boolean availability){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        isAvailable = availability;
    }

    //getter method for a book's ISBN
    public String getISBN(){
        return ISBN;
    }

    // Allows a book to be borrowed if it is available
    public boolean borrowBook(){
        if (!isAvailable){
            System.out.println("The book \"" + title + "\" is not available and cannot be borrowed.");
            return false;
        }
        else {
            isAvailable = false;
            return true;
        }
    }

    // Return the book, making it available again
    public void returnBook(){
        isAvailable = true;
    }

    // Print out the title, author, ISBN, and availability of a book
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.print("Status: ");
        if(isAvailable){
            System.out.println("Available");
        }
        else{
            System.out.println("Unavailable");
        }
    }
}

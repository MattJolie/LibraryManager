/***************************************************
 * Author: Matt Jolie
 * This class defines a Book object with a title, author, and ISBN
 * The Book also has a status of whether it is available
 *
 * The class includes a constructor, and check-in/out methods,
 * as well as methods to get a Book's ISBN and to print the details of a Book
 **************************************************/

abstract class Book{
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

    // Checking a book's availability
    public boolean isAvailable(){
        return isAvailable;
    }

    // setting availability for a book
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    // displaying info, will be implemented by child classes
    public abstract void displayInfo();

    //getter method for title
    public String getTitle(){
        return title;
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

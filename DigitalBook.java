/***********************************************
 * Author: Matt Jolie
 *
 * This class inherits the Book class, adding the
 * parameter of a file type for a digital book
 *
 * There is a method that prints details about the
 * book, overriding the parent's method
 **********************************************/

public class DigitalBook extends Book {
    // additional attributes
    private String fileFormat;

    // constructor
    public DigitalBook(String title, String author, String ISBN, boolean availability, String fileFormat){
        super(title, author, ISBN, availability);
        this.fileFormat = fileFormat;
    }

    // print out information about the digital book
    @Override
    public void printDetails() {
        System.out.println("Book type: Digital");
        System.out.println("File format: " + fileFormat);
        System.out.println();
    }
}

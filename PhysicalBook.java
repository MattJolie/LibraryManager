/***********************************************
 * Author: Matt Jolie
 *
 * This class inherits the Book class, adding the
 * parameter of a weight for a physical book
 *
 * There is a method that prints details about the
 * book, overriding the parent's method
 **********************************************/

public class PhysicalBook extends Book {
    // attributes
    private double weight;

    // constructor
    public PhysicalBook(String title, String author, String ISBN, boolean availability, double weight){
        super(title, author, ISBN, availability);
        this.weight = weight;
    }

    // method for displaying book type and weight
    @Override
    public void displayInfo(){
        System.out.print("Book type: Physical, ");
        System.out.print("Title: " + getTitle());
        System.out.println(", Weight: " + weight + "kg");
    }
}

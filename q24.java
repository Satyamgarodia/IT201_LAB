package riyab;
// take user input if required

final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class.");
    }
}

// Cannot extend a final class
// class SubClass extends FinalClass { }

public class q24 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showMessage();
    }
}
package riyab;package riyab;

/**
 * This class demonstrates the use of a final class in Java.
 * A final class cannot be extended by any other class.
 */
final class FinalClass {
    /**
     * Displays a message indicating that this is a final class.
     */
    public void showMessage() {
        System.out.println("This is a final class.");
    }
    
    /**
     * Constructor to initialize the FinalClass object.
     */
    public FinalClass() {
        System.out.println("FinalClass object created");
    }
    
    /**
     * Main method to test the FinalClass.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.showMessage();
    }
}
// q39: Nested try blocks
package riyab;
// take user input if required

public class q9c {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch block.");
        }
    }
}

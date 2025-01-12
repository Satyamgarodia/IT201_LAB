// q37: Multiple catch blocks
package riyab;
// take user input if required

public class q37 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }
}

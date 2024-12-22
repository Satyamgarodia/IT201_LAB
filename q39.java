// q39: Nested try blocks
package it201;

public class q39 {
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

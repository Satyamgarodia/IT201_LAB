// q34: NumberFormatException
package it201;

public class q8b {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

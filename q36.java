// q36: finally block
package it201;

public class q36 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

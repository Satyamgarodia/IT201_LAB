// q42: Custom exception
package it201;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class q42 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception occurred.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

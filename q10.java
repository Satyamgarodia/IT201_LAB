// q42: Custom exception

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class q10 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception occurred.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

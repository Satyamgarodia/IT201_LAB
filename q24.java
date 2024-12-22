package it201;

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

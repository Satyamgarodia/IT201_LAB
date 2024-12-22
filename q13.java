package it201;

public class q13 {
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, String b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of integers: " + calc.add(5, 10));
        System.out.println("Addition of doubles: " + calc.add(2.5, 3.5));
        System.out.println("Addition of strings: " + calc.add("Hello", "World"));
    }
}

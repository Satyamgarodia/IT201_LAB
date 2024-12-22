package it201;

public class q4 {
    public static void main(String[] args) {
        char ch = 'a';

        if (Character.isLetter(ch)) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Error: Input is not a valid character.");
        }
    }
}
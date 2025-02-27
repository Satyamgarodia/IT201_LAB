package riyab;
// take user input if required

public class q30 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original StringBuilder: " + sb);
        sb.append(" World");
        System.out.println("After Append: " + sb);
        sb.insert(5, ",");
        System.out.println("After Insert: " + sb);
        sb.reverse();
        System.out.println("After Reverse: " + sb);
    }
}

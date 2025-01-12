<<<<<<< HEAD:OldSyllabus/q30.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q30.java

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

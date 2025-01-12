// q31: Programs based on Class StringBuffer
package riyab;
// take user input if required

public class q31 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 12, "Beautiful");
        sb.delete(0, 1);
        sb.reverse();
        System.out.println(sb);
    }
}

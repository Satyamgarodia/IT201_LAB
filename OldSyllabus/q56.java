// q56: Open file using FileInputStream and display content
<<<<<<< HEAD:OldSyllabus/q56.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q56.java

import java.io.FileInputStream;
import java.io.IOException;

public class q56 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file2.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

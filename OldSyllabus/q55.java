// q55: Create file using FileOutputStream and enter String data
<<<<<<< HEAD:OldSyllabus/q55.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q55.java

import java.io.FileOutputStream;
import java.io.IOException;

public class q55 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file2.txt")) {
            String str = "Hello World!";
            fos.write(str.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

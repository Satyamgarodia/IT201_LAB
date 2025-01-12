// q54: Create file using FileOutputStream and enter byte data
<<<<<<< HEAD:OldSyllabus/q54.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q54.java

import java.io.FileOutputStream;
import java.io.IOException;

public class q54 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("file1.txt")) {
            fos.write(65);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

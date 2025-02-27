// q54: Create file using FileOutputStream and enter byte data
package riyab;
// take user input if required

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

// q56: Open file using FileInputStream and display content
package riyab;
// take user input if required

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

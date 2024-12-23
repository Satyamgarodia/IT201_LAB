// q55: Create file using FileOutputStream and enter String data
package it201;

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

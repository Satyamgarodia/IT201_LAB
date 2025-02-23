
// WAP to print names of all files & folder of a user Inputted String.
import java.io.*;

public class folder {
    public static void main(String[] args) {
        System.err.println("Enter the path of the directory");
        File n = new File(new java.util.Scanner(System.in).nextLine());
        if (!n.isDirectory())
            System.out.println("Not a directory");
        else {
            String[] files = n.list();
            for (String f : files)
                System.out.println(f);
        }
    }
}

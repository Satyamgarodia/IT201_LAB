import java.io.*;

public class fileWriter {
    public static void main(String[] args) throws Exception {
        try {
            FileWriter fr = new FileWriter("C:\\Users\\satya\\OneDrive\\Desktop\\h.txt");
            fr.append("11").close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
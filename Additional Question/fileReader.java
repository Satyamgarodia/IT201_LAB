import java.io.*;

public class fileReader {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader("C:\\Users\\satya\\OneDrive\\Desktop\\h.txt");
            BufferedReader br = new BufferedReader(fr);
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

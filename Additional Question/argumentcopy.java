import java.io.*;

public class argumentcopy {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);
            BufferedReader br = new BufferedReader(fr);
            int i;
            while ((i = br.read()) != -1)
                fw.write(i);
            br.close();
            fr.close();
            fw.close();
            System.out.println("Copied Successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
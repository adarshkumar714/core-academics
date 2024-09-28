package labexps;

import java.io.FileInputStream;
import java.io.InputStream;

public class seven {
    public static void main(String[] args) {
        InputStream file = null;
        try {
            file = new FileInputStream("./extra-files/a.txt");
            System.out.println((char)file.read());
            System.out.println((char)file.read());
            file.close();
        } catch (Exception e) {
            System.out.println("An error occured!");
        }
    }
}

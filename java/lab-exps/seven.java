import java.io.*;

public class seven {
    public static void main(String[] args) {
        InputStream file = null;
        try {
            file = new FileInputStream("a.txt");
            System.out.println((char)file.read());
            System.out.println((char)file.read());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

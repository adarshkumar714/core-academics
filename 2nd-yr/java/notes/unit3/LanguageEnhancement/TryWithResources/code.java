// package notes.unit3.LanguageEnhancement.TryWithResources;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class A implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("closing...");
    }
}

public class code {
    public static void main(String[] args) {
        // try (A a = new A()){
        @SuppressWarnings("unused")
        int i;
        try (
                A resource = new A();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("try block");

            System.out.print("Enter a number: ");
            String input = reader.readLine();

            i = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }
    }
}

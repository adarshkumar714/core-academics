// package FunctionalProgramming.Base64_en_den;

import java.util.Base64;

public class en {
    public static void main(String[] args) {
        String originalInput = "Hello, World!";
        System.out.println(originalInput.getBytes());
        // Encode
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("Encoded string: " + encodedString);
    }
}

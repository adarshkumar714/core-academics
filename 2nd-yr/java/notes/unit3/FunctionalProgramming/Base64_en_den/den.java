package FunctionalProgramming.Base64_en_den;

import java.util.Base64;

public class den {
    public static void main(String[] args) {
        String encodedString = "SGVsbG8sIFdvcmxkIQ==";
        // Decode
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);
    }
}

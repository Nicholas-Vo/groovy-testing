package features;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class JavaHash {
    public static void main(String[] args) {
        try {
            // Define the string to be hashed
            String input = "Hello, World!";

            // Use the SHA-256 algorithm to hash the string
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));

            // Print the resulting hash value
            System.out.println(bytesToHex(hash));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Converts a byte array to a hexadecimal string
    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}



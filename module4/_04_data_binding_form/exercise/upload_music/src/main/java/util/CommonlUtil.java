package util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CommonlUtil {
    public static String encode64(String raw) {
        return Base64.getEncoder().encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }

    public static String decode64(String raw) {
        byte[] decodedBytes;
        String decodedString = "";
        try {
            decodedBytes = Base64.getDecoder().decode(raw.getBytes(StandardCharsets.UTF_8));
            decodedString = new String(decodedBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decodedString;
    }
}

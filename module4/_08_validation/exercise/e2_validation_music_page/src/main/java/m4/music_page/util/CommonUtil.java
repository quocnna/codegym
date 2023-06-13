package m4.music_page.util;

import jakarta.xml.bind.DatatypeConverter;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;

import javax.servlet.ServletContext;
import java.io.File;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class CommonUtil {
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

    public static String encodeMD5(String raw) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(raw.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest);
    }

    public static MediaType getMediaTypeForFileName(ServletContext servletContext, String fileName) {
        String mineType = servletContext.getMimeType(fileName);
        try {
            return MediaType.parseMediaType(mineType);
        } catch (Exception e) {
            return MediaType.APPLICATION_OCTET_STREAM;
        }
    }

    public static String getAbsolutePath(String folder) {
        String rootPath = System.getProperty("catalina.home");
        File dir = new File(rootPath + File.separator + folder);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        return dir.getAbsolutePath();
    }

    public static Resource loadFileAsResource(String filePath) {
        Resource resource = null;
        try {
            resource = new UrlResource(Paths.get(filePath).toUri());
            if (resource.exists()) {
                return resource;
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }

        return resource;
    }
}

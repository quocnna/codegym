package service;

import model.Song;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import util.CommonlUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SongService {
    private static List<Song> songs = new ArrayList<>();

    static {
        songs.add(new Song(1, "Aloha", "Alex", "Ballad", "link", null));
        songs.add(new Song(2, "Love", "Test 1", "Ballad", "link1", null));
        songs.add(new Song(3, "Beautiful white", "Test 2", "Ballad", "link2", null));
    }

    public ResponseEntity<Resource> downloadFile(String code) {
        Resource resource = null;
        String tmp = code.substring(0, code.length() - 2);
        String path = getAbsolutePath(tmp);
        resource = loadFileAsResource(path);
        String fileName = "aaa";

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("image/jpeg"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

    public void create(Song song) {
        int lastId = 0;

        if (songs.size() > 0) {
            lastId = songs.get(songs.size() - 1).getId();
        }
        song.setId(lastId + 1);
        MultipartFile multipartFile = song.getImage();
        String idEncode = CommonlUtil.encode64(String.valueOf(song.getId()));
        try {
            String path = getAbsolutePath(idEncode);
            FileCopyUtils.copy(multipartFile.getBytes(), new File(path));
            String url = ServletUriComponentsBuilder.fromCurrentRequest().toUriString();
            URI uri = new URI(url);
            song.setLink(String.format("%s://%s:8080/img/%s", uri.getScheme(), uri.getHost(), idEncode + "QG"));
            songs.add(song);
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public List<Song> getAll() {
        return songs;
    }

    public Resource loadFileAsResource(String filePath) {
        Resource resource = null;
        try {
            resource = new UrlResource(Paths.get(filePath).toUri());
            if (resource.exists())
                return resource;
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        return resource;
    }

    private String getAbsolutePath(String idEncode) {
        String rootPath = System.getProperty("catalina.home");
//            System.getProperty("user.dir");
//            String saveDirectory= request.getSession().getServletContext().getRealPath("/");
        File dir = new File(rootPath + File.separator + "img");
        if (!dir.exists())
            dir.mkdirs();
        return dir.getAbsolutePath() + "\\" + idEncode;
    }
}

package service;

import model.Song;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SongService {
    private static final String PATH = "src/main/webapp/WEB-INF/img/";
    private static List<Song> songs= new ArrayList<>();
    static {
        songs.add(new Song("Aloha", "Alex", "Ballad", "link", null));
        songs.add(new Song("Love", "Test 1", "Ballad", "link1", null));
        songs.add(new Song("Beautiful white", "Test 2", "Ballad", "link2", null));
    }

    public void create(Song song){
        MultipartFile multipartFile = song.getImage();
        String fileName =multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(multipartFile.getBytes(), new File(PATH + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        songs.add(song);
    }

    public List<Song> getAll(){
        return songs;
    }
}

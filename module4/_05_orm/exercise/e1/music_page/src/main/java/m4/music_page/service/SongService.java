package m4.music_page.service;

import m4.music_page.model.Song;
import m4.music_page.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
     @Autowired
    private SongRepository songRepository;

     public List<Song> findAll(){
         return songRepository.findAll();
     }
}

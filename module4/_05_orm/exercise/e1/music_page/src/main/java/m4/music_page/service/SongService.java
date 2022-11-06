package m4.music_page.service;

import m4.music_page.model.Song;
import m4.music_page.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
     @Autowired
    private SongRepository songRepository;

     public List<Song> findAll(){
         return songRepository.findAll();
     }

     public void save(Song song){
         songRepository.save(song);
     }

     public Optional<Song> findById(Long id){
         return songRepository.getById(id);
     }

     public void  delete(Long id){
         songRepository.delete(id);
     }
}

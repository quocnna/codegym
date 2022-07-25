package m4.music_page.controller;

import m4.music_page.model.Song;
import m4.music_page.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("list")
    public ModelAndView list() {
        List<Song> songs = songService.findAll();
        return new ModelAndView("list", "res", songs);
    }

    @GetMapping("create")
    public String create(){
        return "form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute Song song){
//        songService.create(song);
        return "redirect:/list";
    }

    @GetMapping("img/{code}")
    public ResponseEntity<Resource> playMp3(@PathVariable String code) {
        return null;
//        return songService.downloadFile(code);
    }
}

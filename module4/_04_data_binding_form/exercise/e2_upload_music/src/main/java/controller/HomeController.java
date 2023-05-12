package controller;

import model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.SongService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HomeController {
    private final SongService songService;

    public HomeController(SongService songService){
        this.songService = songService;
    }

    @GetMapping("home")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("home", "res", songService.getAll());
    }

    @GetMapping("create")
    public String create(){
        return "form";
    }

    @PostMapping
    public String save(@ModelAttribute Song song){
        songService.create(song);

        return "redirect:/home";
    }

    @GetMapping("img/{code}")
    public ResponseEntity<Resource> viewImage(@PathVariable String code) {
        return songService.downloadFile(code);
    }
}

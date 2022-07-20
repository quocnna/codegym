package controller;

import model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.SongService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private SongService songService;

//    @Autowired
//    public void setSongService(SongService songService) {
//        this.songService = songService;
//    }

    @GetMapping("home")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
        List<Song> songs = songService.getAll();
        return new ModelAndView("home", "res", songs);
    }

    @GetMapping("create")
    public String create(){

        return "form";
    }
}

package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import service.SongService;

@Controller
public class HomeController {
    @Autowired
    private SongService songService;
    @GetMapping
    public String home(){
        return "home";
    }
}

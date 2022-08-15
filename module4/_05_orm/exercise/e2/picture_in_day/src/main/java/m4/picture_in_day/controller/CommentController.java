package m4.picture_in_day.controller;

import m4.picture_in_day.model.Comment;
import m4.picture_in_day.model.Picture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    @GetMapping("home")
    public String home(){
        return "home";
    }

    @PostMapping("save")
    public String save(Comment comment){
        System.out.println(comment);
        return "redirect:/home";
    }
}

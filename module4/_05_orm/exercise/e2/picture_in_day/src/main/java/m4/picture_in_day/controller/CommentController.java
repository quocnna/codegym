package m4.picture_in_day.controller;

import m4.picture_in_day.model.Comment;
import m4.picture_in_day.model.Picture;
import m4.picture_in_day.repository.CommentRepository;
import m4.picture_in_day.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Optional;

@Controller
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PictureRepository pictureRepository;

    @GetMapping("home")
    public String home(Model model) {
        model.addAttribute("comment", new Comment());
        Optional<Picture> optionalPicture = pictureRepository.find(LocalDate.now());
        model.addAttribute("picture", optionalPicture.isPresent() ? optionalPicture.get() : new Picture());

        return "home";
    }

    @PostMapping("save")
    public String save(Comment comment) {
        commentRepository.save(comment);
        return "redirect:/home";
    }
}

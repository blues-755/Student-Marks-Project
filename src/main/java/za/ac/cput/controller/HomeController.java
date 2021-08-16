package za.ac.cput.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String home() {
        return "Student Application Home Page";
    }
}

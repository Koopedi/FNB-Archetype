package za.co.fnb.wi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.fnb.wi.services.HomeService;

@Controller
public class HomeController {

    @Autowired
    private HomeService myService;

    @GetMapping("/")
    public String home(Model model) {
        String message = "ThymeLeaf is working"; // myService.getMessage();
        model.addAttribute("message", message);
        return "home";
    }

}

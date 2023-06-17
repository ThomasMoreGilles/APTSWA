package be.thomasmore.library.controllers;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"", "/", "/home"})
    public String home() {
       
        return "home";
    }

}
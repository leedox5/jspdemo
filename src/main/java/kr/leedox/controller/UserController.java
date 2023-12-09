package kr.leedox.controller;

import kr.leedox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String helloJsp(@RequestParam String name,  Model model) {
        model.addAttribute("name", name);
        return "Hello";
    }

    @GetMapping("/user")
    public String AllUser(Model model) {
        model.addAttribute("users", userService.getUserList());
        return "User";
    }
}

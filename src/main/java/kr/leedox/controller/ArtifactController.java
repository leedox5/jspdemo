package kr.leedox.controller;

import kr.leedox.service.ArtifactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtifactController {

    @Autowired
    ArtifactService artifactService;

    @GetMapping("/mainpage")
    public String allUser(Model model) {
        model.addAttribute("artifacts", artifactService.getList());
        return "mainpage";
    }
}

package exspring.controllers;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/generos")
public class GeneroController {
    @RequestMapping("list")
    public String list() {
        return "list";
    }
}
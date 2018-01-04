package be.sitefun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public String getIndexPage() {
        return "/index";
    }

}

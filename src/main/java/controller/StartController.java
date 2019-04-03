package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;


@Controller
public class StartController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String home() throws Exception {
        //TODO - return List
        return "index";
    }
}

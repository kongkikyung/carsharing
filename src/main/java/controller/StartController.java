package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.annotation.Resource;

@Controller
public class StartController {
    @Resource(name="userService")
    private UserService userService;

    @RequestMapping(value = "/")
    public String home() throws Exception {
        System.out.println(userService.selectUserAll());
        return "index";
    }
}

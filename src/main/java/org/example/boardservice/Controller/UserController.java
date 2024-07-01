package org.example.boardservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/","/list"})
    public String list() {
        System.out.println("USer-----");
        return "User/UserList";

    }
}

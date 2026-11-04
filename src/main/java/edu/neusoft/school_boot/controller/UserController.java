package edu.neusoft.school_boot.controller;

import edu.neusoft.school_boot.service.UserService;
import edu.neusoft.school_boot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;
    //实现注册
    @PostMapping("/register")
    public String registerUser( User user){
        boolean result = userService.register(user);
        if(result){
            return "注册成功";
        } else {
            return "注册失败";
        }
    }
    @PostMapping("/login")
    public User login(@RequestBody User user){
        User result = userService.login(user);
        return result;
    }

}

package edu.neusoft.school_boot.controller;

import edu.neusoft.school_boot.service.UserService;
import edu.neusoft.school_boot.vo.Result;
import edu.neusoft.school_boot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin  //跨域访问
public class UserController {
    @Autowired
    UserService userService;
    //实现注册
    @PostMapping("/register")
    public Result<Void> registerUser(@RequestBody User user){
        if(userService.register(user)){
            return Result.success();
        }
        return Result.fail("注册失败");

    }
    @PostMapping("/login")
    public Result<User> login(@RequestBody User user){
        User result = userService.login(user);
        if(result!=null){
            return Result.success(result);
        }
        return Result.fail("用户名或密码错误");
    }

}

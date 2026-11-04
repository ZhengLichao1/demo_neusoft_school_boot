package edu.neusoft.school_boot.service;

import edu.neusoft.school_boot.vo.User;

public interface UserService {
    //注册的方法
    boolean register(User user);
    //登录的方法
    User login(User user);
}

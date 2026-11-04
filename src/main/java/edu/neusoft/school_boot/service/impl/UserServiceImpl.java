package edu.neusoft.school_boot.service.impl;

import edu.neusoft.school_boot.dao.UserMapper;
import edu.neusoft.school_boot.service.UserService;
import edu.neusoft.school_boot.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //业务逻辑层注解，表示这是一个服务层的类
public class UserServiceImpl implements UserService {
    @Autowired   //自动装配，表示将UserMapper接口的实例注入到UserServiceImpl类中
    UserMapper userMapper;


    @Override
    public boolean register(User user) {
        int result = userMapper.registerUser(user);
        if(result > 0) {  //受影响行数大于0，添加成功
            return true;
        }
        return false;
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}

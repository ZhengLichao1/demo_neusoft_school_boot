package edu.neusoft;

import edu.neusoft.school_boot.dao.UserMapper;
import edu.neusoft.school_boot.vo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = App.class)
public class AppTest
{
    //测试UserMapper,依赖注入
    @Autowired
    private UserMapper userMapper;

/*    @Test
    //测试注册功能
    public void testRegisterUser() {
        User user = new User("wangwu", "123456", "王五",
                "Neusoft", "student");
        System.out.println(userMapper.registerUser(user));
    }
    @Test
    //测试登录
    public void testLogin() {
        User user = new User();
        user.setUserName("tom");
        user.setPassword("123");
        System.out.println(userMapper.login(user));
    }*/
    @Test
    //测试查询所有用户
    public void testGetAllUsers() {
        List<User> list = userMapper.getAllUsers();{
        list.forEach(user -> System.out.println(user));
        }
    }
    @Test
    //测试修改用户
    public void testUpdateUser() {
        User user = new User(9,"xxx", "123456", "rrr",
                "Neusoft", "student");
        System.out.println(userMapper.updateUser(user));
    }
    @Test
    //测试删除用户
    public void testDeleteUser() {
        System.out.println(userMapper.deleteUserById(9));
    }

}

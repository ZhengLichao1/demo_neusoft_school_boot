package edu.neusoft.school_boot.dao;
import edu.neusoft.school_boot.vo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //用户注册
    @Insert("insert into user (user_name, password, real_name, school_name, user_type) " +
            "values (#{userName}, #{password}, #{realName}, #{schoolName}, #{userType})")
    public int registerUser(User user);
    //用户登录
    @Select("select * from user where user_name = #{userName} and password = #{password}")
    public User login(User user);
    //查询所有用户
    @Select("select * from user")
    public List<User> getAllUsers();
    //根据id删除用户
    @Delete("delete from user where user_id = #{userId}")
    public int deleteUserById(int id);
    //修改用户信息
    @Update("update user set user_name = #{userName}, password = #{password}, " +
            "real_name = #{realName}, school_name = #{schoolName}, " +
            "user_type = #{userType} where user_id = #{userId}")
    public int updateUser(User user);
}

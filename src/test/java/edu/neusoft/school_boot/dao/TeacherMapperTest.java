package edu.neusoft.school_boot.dao;

import edu.neusoft.App;
import edu.neusoft.school_boot.vo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = App.class)
public class TeacherMapperTest
{
    //测试TeacherMapper,依赖注入
    @Autowired
    public TeacherMapper teacherMapper;

    @Test
    //测试查询所有教师
    public void testGetAllTeachers() {
        List<Teacher> list = teacherMapper.selectAllTeacher();
        list.forEach(teacher -> System.out.println(teacher));
    }

    @Test
    //测试添加教师
    public void testInsertTeacher() {
        Teacher teacher = new Teacher(0, "张老师", "M", "13800000001", 1);
        System.out.println(teacherMapper.insertTeacher(teacher));
    }

    @Test
    //测试根据id查询教师
    public void testSelectTeacherById() {
        System.out.println(teacherMapper.selectTeacherById(1));
    }

    @Test
    //测试修改教师
    public void testUpdateTeacher() {
        Teacher teacher = new Teacher(1, "李老师", "F", "13800000002", 1);
        System.out.println(teacherMapper.updateTeacher(teacher));
    }

    @Test
    //测试删除教师
    public void testDeleteTeacher() {
        System.out.println(teacherMapper.deleteTeacher(1));
    }
}

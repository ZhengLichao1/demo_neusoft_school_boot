package edu.neusoft.school_boot.dao;

import edu.neusoft.App;
import edu.neusoft.school_boot.vo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = App.class)
public class StudentMapperTest
{
    //测试StudentMapper,依赖注入
    @Autowired
    public StudentMapper studentMapper;

    @Test
    //测试查询所有学生
    public void testGetAllStudents() {
        List<Student> list = studentMapper.selectAllStudent();
        list.forEach(student -> System.out.println(student));
    }

    @Test
    //测试添加学生
    public void testInsertStudent() {
        Student student = new Student(0, "王同学", "F", "13900000001", 1, 1);
        System.out.println(studentMapper.insertStudent(student));
    }

    @Test
    //测试根据id查询学生
    public void testSelectStudentById() {
        System.out.println(studentMapper.selectStudentById(1));
    }

    @Test
    //测试修改学生
    public void testUpdateStudent() {
        Student student = new Student(1, "赵同学", "M", "13900000002", 1, 1);
        System.out.println(studentMapper.updateStudent(student));
    }

    @Test
    //测试删除学生
    public void testDeleteStudent() {
        System.out.println(studentMapper.deleteStudent(1));
    }
}

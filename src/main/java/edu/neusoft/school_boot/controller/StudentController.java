package edu.neusoft.school_boot.controller;

import edu.neusoft.school_boot.service.StudentService;
import edu.neusoft.school_boot.vo.Result;
import edu.neusoft.school_boot.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    //post增加，put修改，delete删除，get查询

    @GetMapping
    public Result<List<Student>> getAllStudents(){
        return Result.success(studentService.getAllStudents());
    }
    //根据id查询
    @GetMapping("/{id}")
    public Result<Student> getStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return student != null ? Result.success(student) : Result.fail("该学生不存在");
    }
    //添加学生
    @PostMapping
    public Result<Integer> addStudent(@RequestBody Student student){
        int rows = studentService.addStudent(student);
        return rows > 0 ? Result.success(rows) : Result.fail("添加失败");
    }
    //修改学生
    @PutMapping
    public Result<Integer> updateStudent(@RequestBody Student student){
        int rows = studentService.updateStudent(student);
        return rows > 0 ? Result.success(rows) : Result.fail("修改失败");
    }
    //删除学生
    @DeleteMapping("/{id}")
    public Result<Integer> deleteStudent(@PathVariable int id){
        int rows = studentService.deleteStudent(id);
        return rows > 0 ? Result.success(rows) : Result.fail("删除失败");
    }

}

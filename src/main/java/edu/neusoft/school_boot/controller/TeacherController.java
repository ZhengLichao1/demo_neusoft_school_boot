package edu.neusoft.school_boot.controller;

import edu.neusoft.school_boot.service.TeacherService;
import edu.neusoft.school_boot.vo.Result;
import edu.neusoft.school_boot.vo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    //post增加，put修改，delete删除，get查询

    @GetMapping
    public Result<List<Teacher>> getAllTeachers(){
        return Result.success(teacherService.getAllTeachers());
    }
    //根据id查询
    @GetMapping("/{id}")
    public Result<Teacher> getTeacherById(@PathVariable int id){
        Teacher teacher = teacherService.getTeacherById(id);
        return teacher != null ? Result.success(teacher) : Result.fail("该教师不存在");
    }
    //添加教师
    @PostMapping
    public Result<Integer> addTeacher(@RequestBody Teacher teacher){
        int rows = teacherService.addTeacher(teacher);
        return rows > 0 ? Result.success(rows) : Result.fail("添加失败");
    }
    //修改教师
    @PutMapping
    public Result<Integer> updateTeacher(@RequestBody Teacher teacher){
        int rows = teacherService.updateTeacher(teacher);
        return rows > 0 ? Result.success(rows) : Result.fail("修改失败");
    }
    //删除教师
    @DeleteMapping("/{id}")
    public Result<Integer> deleteTeacher(@PathVariable int id){
        int rows = teacherService.deleteTeacher(id);
        return rows > 0 ? Result.success(rows) : Result.fail("删除失败");
    }

}

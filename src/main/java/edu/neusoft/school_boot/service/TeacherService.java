package edu.neusoft.school_boot.service;

import edu.neusoft.school_boot.vo.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
    int addTeacher(Teacher teacher);
    int updateTeacher(Teacher teacher);
    int deleteTeacher(int id);
}

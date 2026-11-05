package edu.neusoft.school_boot.service.impl;

import edu.neusoft.school_boot.dao.TeacherMapper;
import edu.neusoft.school_boot.service.TeacherService;
import edu.neusoft.school_boot.vo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    public TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.selectAllTeacher();
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherMapper.selectTeacherById(id);
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.insertTeacher(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    @Override
    public int deleteTeacher(int id) {
        return teacherMapper.deleteTeacher(id);
    }
}

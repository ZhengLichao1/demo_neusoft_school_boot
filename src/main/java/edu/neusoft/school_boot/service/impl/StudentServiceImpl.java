package edu.neusoft.school_boot.service.impl;

import edu.neusoft.school_boot.dao.StudentMapper;
import edu.neusoft.school_boot.service.StudentService;
import edu.neusoft.school_boot.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    public StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.selectAllStudent();
    }

    @Override
    public Student getStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insertStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }
}

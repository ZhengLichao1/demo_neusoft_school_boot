package edu.neusoft.school_boot.dao;

import edu.neusoft.school_boot.vo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    //查询全部学生
    @Select("select * from student")
    List<Student> selectAllStudent();

    //添加学生
    @Insert("insert into student (student_name, student_gender, student_phone, major_id, level_id) " +
            "values (#{studentName}, #{studentGender}, #{studentPhone}, #{majorId}, #{levelId})")
    int insertStudent(Student student);

    //删除学生
    @Delete("delete from student where student_id = #{studentId}")
    int deleteStudent(int studentId);

    //修改学生
    @Update("update student set student_name = #{studentName}, student_gender = #{studentGender}, " +
            "student_phone = #{studentPhone}, major_id = #{majorId}, level_id = #{levelId} " +
            "where student_id = #{studentId}")
    int updateStudent(Student student);

    //根据id查学生
    @Select("select * from student where student_id = #{studentId}")
    Student selectStudentById(int studentId);
}

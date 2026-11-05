package edu.neusoft.school_boot.dao;

import edu.neusoft.school_boot.vo.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    //查询全部教师
    @Select("select * from teacher")
    List<Teacher> selectAllTeacher();

    //添加教师
    @Insert("insert into teacher (teacher_name, teacher_gender, teacher_phone, major_id) " +
            "values (#{teacherName}, #{teacherGender}, #{teacherPhone}, #{majorId})")
    int insertTeacher(Teacher teacher);

    //删除教师
    @Delete("delete from teacher where teacher_id = #{teacherId}")
    int deleteTeacher(int teacherId);

    //修改教师
    @Update("update teacher set teacher_name = #{teacherName}, teacher_gender = #{teacherGender}, " +
            "teacher_phone = #{teacherPhone}, major_id = #{majorId} where teacher_id = #{teacherId}")
    int updateTeacher(Teacher teacher);

    //根据id查教师
    @Select("select * from teacher where teacher_id = #{teacherId}")
    Teacher selectTeacherById(int teacherId);
}

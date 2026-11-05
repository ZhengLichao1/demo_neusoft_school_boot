package edu.neusoft.school_boot.dao;

import edu.neusoft.school_boot.vo.Major;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MajorMapper {
    //查询全部
    @Select("select * from major")
    List<Major> selectAllMajor();
    //添加专业
    @Insert("insert into major ( major_name, major_credithour, major_lengthofschool) " +
            "values (#{majorName},#{majorCreditHour},#{majorLengthOfSchool})")
    int insertMajor(Major major);
    //删除专业
    @Delete("delete from major where major_id = #{majorId}")
    int deleteMajor(int majorId);
    //修改专业
    @Update("update major set major_name = #{majorName}, major_credithour = #{majorCreditHour}," +
    "major_lengthofschool = #{majorLengthOfSchool} where major_id = #{majorId}")
    int updateMajor(Major major);
    //根据id查专业
    @Select("select * from major where major_id = #{majorId}")
    Major selectMajorById(int majorId);
}


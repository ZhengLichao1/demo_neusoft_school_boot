package edu.neusoft.school_boot.dao;

import edu.neusoft.school_boot.vo.Level;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LevelMapper {
    //实现一览（查询全部）
    @Select("select * from level")
    List<Level> selectAllLevels();
    //添加层次
    @Insert("insert into level (level_name) values (#{levelName})")
    int insertLevel(Level level);
    //删除层次
    @Delete("delete from level where level_id = #{levelId}")
    int deleteLevel(int levelId);
    //修改层次
    @Update("update level set level_name = #{levelName} where level_id = #{levelId}")
    int updateLevel(Level level);
    //根据id查层次
    @Select("select * from level where level_id = #{levelId}")
    Level selectLevelById(int levelId);
}

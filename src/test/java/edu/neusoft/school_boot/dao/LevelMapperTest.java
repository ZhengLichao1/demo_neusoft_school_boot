package edu.neusoft.school_boot.dao;

import edu.neusoft.App;
import edu.neusoft.school_boot.vo.Level;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = App.class)
public class LevelMapperTest
{
    //测试LevelMapper,依赖注入
    @Autowired
    public LevelMapper levelMapper;

    @Test
    //测试查询所有层次
    public void testGetAllLevels() {
        List<Level> list = levelMapper.selectAllLevels();
        list.forEach(level -> System.out.println(level));
    }

    @Test
    //测试添加层次
    public void testInsertLevel() {
        Level level = new Level(0, "本科");
        System.out.println(levelMapper.insertLevel(level));
    }

    @Test
    //测试根据id查询层次
    public void testSelectLevelById() {
        System.out.println(levelMapper.selectLevelById(1));
    }

    @Test
    //测试修改层次
    public void testUpdateLevel() {
        Level level = new Level(1, "研究生");
        System.out.println(levelMapper.updateLevel(level));
    }

    @Test
    //测试删除层次
    public void testDeleteLevel() {
        System.out.println(levelMapper.deleteLevel(1));
    }
}

package edu.neusoft.school_boot.dao;

import edu.neusoft.App;
import edu.neusoft.school_boot.vo.Major;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = App.class)
public class MajorMapperTest
{
    //测试MajorMapper,依赖注入
    @Autowired
    public MajorMapper majorMapper;

    @Test
    //测试查询所有专业
    public void testGetAllMajors() {
        List<Major> list = majorMapper.selectAllMajor();
        list.forEach(major -> System.out.println(major));
    }

    @Test
    //测试添加专业
    public void testInsertMajor() {
        Major major = new Major(0, "软件工程", "120", "4");
        System.out.println(majorMapper.insertMajor(major));
    }

    @Test
    //测试根据id查询专业
    public void testSelectMajorById() {
        System.out.println(majorMapper.selectMajorById(1));
    }

    @Test
    //测试修改专业
    public void testUpdateMajor() {
        Major major = new Major(1, "软件技术", "100", "3");
        System.out.println(majorMapper.updateMajor(major));
    }

    @Test
    //测试删除专业
    public void testDeleteMajor() {
        System.out.println(majorMapper.deleteMajor(1));
    }
}

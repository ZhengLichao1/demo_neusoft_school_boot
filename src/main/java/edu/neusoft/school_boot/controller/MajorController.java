package edu.neusoft.school_boot.controller;

import edu.neusoft.school_boot.service.MajorService;
import edu.neusoft.school_boot.vo.Major;
import edu.neusoft.school_boot.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/major")
@CrossOrigin
public class MajorController {
    @Autowired
    private MajorService majorService;
    //post增加，put修改，delete删除，get查询

    @GetMapping
    public Result<List<Major>> getAllMajors(){
        return Result.success(majorService.getAllMajors());
    }
    //根据id查询
    @GetMapping("/{id}")
    public Result<Major> getMajorById(@PathVariable int id){
        Major major = majorService.getMajorById(id);
        return major != null ? Result.success(major) : Result.fail("该专业不存在");
    }
    //添加专业
    @PostMapping
    public Result<Integer> addMajor(@RequestBody Major major){
        int rows = majorService.addMajor(major);
        return rows > 0 ? Result.success(rows) : Result.fail("添加失败");
    }
    //修改专业
    @PutMapping
    public Result<Integer> updateMajor(@RequestBody Major major){
        int rows = majorService.updateMajor(major);
        return rows > 0 ? Result.success(rows) : Result.fail("修改失败");
    }
    //删除专业
    @DeleteMapping("/{id}")
    public Result<Integer> deleteMajor(@PathVariable int id){
        int rows = majorService.deleteMajor(id);
        return rows > 0 ? Result.success(rows) : Result.fail("删除失败");
    }

}

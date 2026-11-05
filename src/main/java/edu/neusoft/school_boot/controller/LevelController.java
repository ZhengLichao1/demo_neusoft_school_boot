package edu.neusoft.school_boot.controller;


import edu.neusoft.school_boot.service.LevelService;
import edu.neusoft.school_boot.vo.Level;
import edu.neusoft.school_boot.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/level")
@CrossOrigin
public class LevelController {
    @Autowired
    private LevelService levelService;
    //post增加，put修改，delete删除，get查询

    @GetMapping
    public Result<List<Level>> getAllLevels(){
        return Result.success(levelService.getAllLevels()) ;
    }
    //添加层次
    @PostMapping
    public Result<Integer> addLevel(@RequestBody Level level){
        int rows = levelService.addLevel(level);
        return rows > 0 ? Result.success(rows) : Result.fail("添加失败");
    }
    //删除层次
    @DeleteMapping("/{id}")
    public Result<Integer> deleteLevel(@PathVariable int id){
        int rows = levelService.deleteLevel(id);
        return rows > 0 ? Result.success(rows) : Result.fail("删除失败");
    }
    //修改
    @PutMapping
    public Result<Integer> updateLevel(@RequestBody Level level){
        int rows = levelService.updateLevel(level);
        return rows > 0 ? Result.success(rows) : Result.fail("修改失败");
    }
    //根据id查询
    @GetMapping("/{id}")
    public Result<Level> getLevelById(@PathVariable int id){
        Level level = levelService.getLevelById(id);
        return level != null ? Result.success(level) : Result.fail("该层次不存在");
    }
}

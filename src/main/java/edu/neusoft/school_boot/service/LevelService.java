package edu.neusoft.school_boot.service;


import edu.neusoft.school_boot.vo.Level;

import java.util.List;


public interface LevelService {
    List<Level> getAllLevels();
    Level getLevelById(int id);
    int addLevel(Level level);
    int updateLevel(Level level);
    int deleteLevel(int id);
}

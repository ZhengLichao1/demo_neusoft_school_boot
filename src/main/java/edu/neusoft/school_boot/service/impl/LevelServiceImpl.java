package edu.neusoft.school_boot.service.impl;

import edu.neusoft.school_boot.dao.LevelMapper;
import edu.neusoft.school_boot.service.LevelService;
import edu.neusoft.school_boot.vo.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    public LevelMapper levelMapper;

    @Override
    public List<Level> getAllLevels() {
        return levelMapper.selectAllLevels();
    }

    @Override
    public Level getLevelById(int id) {
        return levelMapper.selectLevelById(id);
    }

    @Override
    public int addLevel(Level level) {
        return levelMapper.insertLevel(level);
    }

    @Override
    public int updateLevel(Level level) {
        return levelMapper.updateLevel(level);
    }

    @Override
    public int deleteLevel(int id) {
        return levelMapper.deleteLevel(id);
    }
}

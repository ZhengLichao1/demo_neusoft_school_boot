package edu.neusoft.school_boot.service.impl;

import edu.neusoft.school_boot.dao.MajorMapper;
import edu.neusoft.school_boot.service.MajorService;
import edu.neusoft.school_boot.vo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    public MajorMapper majorMapper;

    @Override
    public List<Major> getAllMajors() {
        return majorMapper.selectAllMajor();
    }

    @Override
    public Major getMajorById(int id) {
        return majorMapper.selectMajorById(id);
    }

    @Override
    public int addMajor(Major major) {
        return majorMapper.insertMajor(major);
    }

    @Override
    public int updateMajor(Major major) {
        return majorMapper.updateMajor(major);
    }

    @Override
    public int deleteMajor(int id) {
        return majorMapper.deleteMajor(id);
    }
}

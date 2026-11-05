package edu.neusoft.school_boot.service;

import edu.neusoft.school_boot.vo.Major;

import java.util.List;

public interface MajorService {
    List<Major> getAllMajors();
    Major getMajorById(int id);
    int addMajor(Major major);
    int updateMajor(Major major);
    int deleteMajor(int id);

}

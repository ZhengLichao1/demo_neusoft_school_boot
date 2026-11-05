package edu.neusoft.school_boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int studentId;
    private String studentName;
    private String studentGender;
    private String studentPhone;
    private int majorId;
    private int levelId;
}

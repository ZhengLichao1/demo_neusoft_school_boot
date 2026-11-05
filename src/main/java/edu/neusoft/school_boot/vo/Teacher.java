package edu.neusoft.school_boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private int teacherId;
    private String teacherName;
    private String teacherGender;
    private String teacherPhone;
    private int majorId;
}

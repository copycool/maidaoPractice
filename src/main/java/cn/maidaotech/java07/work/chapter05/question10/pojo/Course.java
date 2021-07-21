package cn.maidaotech.java07.work.chapter05.question10.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long id;

    private Long courseNo;

    private Long cno;

    private Long createdAt;

    private Long updatedAt;

    private String courseName;

    private Integer credit;

    private String teacherName;

    private String courseType;
}
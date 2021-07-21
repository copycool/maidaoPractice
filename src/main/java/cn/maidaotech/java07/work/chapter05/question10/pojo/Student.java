package cn.maidaotech.java07.work.chapter05.question10.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;

    private Long sno;

    private Long createdAt;

    private Long updatedAt;

    private String stuName;

    private Integer age;

    private Integer sex;

    private Long cno;


}
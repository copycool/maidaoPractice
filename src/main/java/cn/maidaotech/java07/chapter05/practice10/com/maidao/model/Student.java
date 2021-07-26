package com.maidao.model;

import java.util.Map;

public class Student extends TableFields {
    private Long sno;
    private String firstName;
    private String lastName;
    private Integer sex;
    private Long clazzId;
    private String school;
    private String created_at;
    private String updated_at;

    public Student(String tableName, Map<String, String> ormMap, Long sno, String firstName, String lastName, Integer sex, Long clazzId, String school, String created_at, String updated_at) {
        super(tableName, ormMap);
        this.sno = sno;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.clazzId = clazzId;
        this.school = school;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", clazzId=" + clazzId +
                ", school='" + school + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getClazzId() {
        return clazzId;
    }

    public void setClazzId(Long clazzId) {
        this.clazzId = clazzId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}

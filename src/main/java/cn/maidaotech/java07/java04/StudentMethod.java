package cn.maidaotech.java07.java04;

public class StudentMethod implements Comparable<StudentMethod> {
 private int id;  //学号
 private String name;//姓名
 private Integer performance;//成绩
    @Override
    public int compareTo(StudentMethod o) {
        if (!this.getPerformance().equals(o.getPerformance())) {
            return o.getPerformance() - this.getPerformance();
        } else {
            return this.getId() - o.getId();
        }

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "学号=" + id + ", 姓名=" + name + ", 成绩=" + performance ;
    }

    public StudentMethod(){

    }
    public StudentMethod(int id, String name, Integer performance) {
        this.id = id;
        this.name = name;
        this.performance = performance;
    }
    
}
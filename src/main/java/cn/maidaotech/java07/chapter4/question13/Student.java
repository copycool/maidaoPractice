package cn.maidaotech.java07.chapter4.question13;

/**
 * 某班有40个学生，学号为190101~190140，全部参加Java集合阶段测试，给出所有同学的成绩（可随机产生，范围为50~100）
 * 请编写从程序将本班各位同学的成绩从高到低排序打印输出。
 * 注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生i”[i=1，2，3，4，...，40]）和成绩。
 */
public class Student implements Comparable<Student> {
    private Integer stunum;
    private Integer score;
    private String name;

    public Student() {

    }

    public Student(Integer stunum, String name, Integer score) {
        this.stunum = stunum;
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if (!this.getScore().equals(s.getScore())) {
            return (s.getScore() - this.getScore());
        } else {
            return this.getStunum() - s.getStunum();
        }

    }

    @Override
    public String toString() {
        return "学号： " + stunum + ", 姓名： " + name + ", 成绩： " + score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStunum() {
        return stunum;
    }

    public void setStunum(Integer stunum) {
        this.stunum = stunum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
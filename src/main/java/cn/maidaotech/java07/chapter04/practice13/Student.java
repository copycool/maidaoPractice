package cn.maidaotech.java07.chapter04.practice13;
// 某班有 40 个学生，学号为 190101~190140，全部参加 Java 集合阶段测试，
// 给出所有同学的成绩 （可随机产生，范围为 50~100），请编写从程序将本班各位同学的成绩从高到低排序打印输出。
//  注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生 i”[i=1，2，3， 4，...，40]）和成绩。
public class Student implements Comparable<Student> {

    private String stuName;
    private Integer stuId;
    private Integer score;
    public Student(){

    }
    public Student(String stuName,Integer stuId,Integer score){
        this.stuName = stuName;
        this.stuId = stuId;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [姓名=" + stuName + ", 学号=" + stuId + ", 成绩=" + score+ "]";
    }

    @Override
    public int compareTo(Student o) {
        if(!this.getScore().equals(o.getScore())){
            return o.getScore()-this.getScore();
            // -1,降序
        }else {
            return this.getStuId() - o.getStuId();
            // 1，升序
        }
        }
        
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

  


     

    

    
}
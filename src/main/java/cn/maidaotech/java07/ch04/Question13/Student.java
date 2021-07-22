package cn.maidaotech.java07.ch04.Question13;

public class Student implements Comparable<Student>{
    private Integer stuId;
    private Integer score;
    private String name;
    public Student(String string, int i, int j){

    }
    public Student(Integer stuId,Integer score,String name){
        this.stuId=stuId;
        this.score=score;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + ", stuId=" + stuId + "]";
    }
    
    @Override
    public int compareTo(Student s){
        if(!this.getScore().equals(s.getScore())){
            return s.getScore()-this.getScore();
        }else{
            return this.getStuId()-s.getStuId();
        }
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
        public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   

}

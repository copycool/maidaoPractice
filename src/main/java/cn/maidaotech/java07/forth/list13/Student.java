package cn.maidaotech.java07.forth.list13;

// 某班有 40 个学生，学号为 190101~190140，全部参加 Java 集合阶段测试，给出所有同学的成绩 
// （可随机产生，范围为 50~100），请编写从程序将本班各位同学的成绩从高到低排序打印输出。 
// 注：成绩相同时学号较小的优先打印，打印的信息包括学号、姓名（统一为“学生 i”[i=1，2，3， 
// 4，...，40]）和成绩。
public class Student implements Comparable<Student> {
    int id;
    String name;
    int score;

    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
       
        return 0;
    }

}

package cn.maidaotech.java07.order.forthpractice13;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
             public static void main(String[] args) {
         List<Student> list = new ArrayList<>();   
        Student b = null;
        for (int i = 1; i <41; i++) {
            b = new Student();
            b.setScore((int)(Math.random()*50+50));
            // b.setSno(i);
           list.add(b);
        }    
        list.stream().forEach(stu->{
            System.out.println(stu.toString());
        });
}
}
// class Student{
//     int sno;
//     int score;
//     public int getScore(){
//     return score;
//     }
//     public void setScore(int score){
//     this.score= score;
//     }
//     public int getSno() {
//         return sno;
//     }
//     public void setSno(int sno) {
//         this.sno = sno;
//     }
//     @Override
//     public String toString() {
//         return "Student [score=" + score + ", sno=" + sno + "]";
//     }
// }

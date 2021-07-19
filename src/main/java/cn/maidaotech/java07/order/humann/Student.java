package cn.maidaotech.java07.order.humann;

public class Student extends Person{
   private  int math;
   private int english;


public Student (int math,int english){
    this.math=math;
    this.english=english;
}
  public int getMath(){
return this.math;
}
public int getEnglish(){
    return this.english;
}
}
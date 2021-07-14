package cn.maidaotech.java07.chapter02;

public class test2055 {
    
public static void main(String[] args) {
  checkStudentNumber(20181109);
  checkStudentNumber(20180107);
  checkStudentNumber(20181213);
 
}
public static void checkStudentNumber(int studentNumber){
     //checkStudentNumber(20181109);
    //  studentNumber=20180109;
     int year=studentNumber/10000;
     int monthDay=studentNumber%10000;
     int  month=monthDay/100;
     String term;
     if(month<10){
       //month=
       term="0"+month;
     }
     else{
         term=""+month;
     }
     int day=monthDay%100;
     String stnum;
     if(day<10){
       stnum="0"+day;
     }
     else{
         stnum=""+day;
     }
     System.out.println("年份："+year+" 期数："+term+" 序号："+stnum);
    
}
}
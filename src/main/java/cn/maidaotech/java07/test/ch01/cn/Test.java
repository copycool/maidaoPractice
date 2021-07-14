package cn.maidaotech.java07.test.ch01.cn;

public class Test {
    public void getScore (){
        int score=88;
        score=score-1;
        System.out.println("花花期末考试成绩:" + score);
        
    }
    public static void main(String[] args) {
        Test test=new Test();
        test.getScore();
    }
        
}




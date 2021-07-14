package cn.maidaotech.java07.chapter02.forPractice;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.print(j+"*"+i+"="+(i*j));
                System.out.print(" ");
                if (i == j){
                    break;
                }

            }
            System.out.println(" ");
        }
    }
}

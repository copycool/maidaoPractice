package cn.maidaotech.java07.chapter02.forPractice;


//素数
public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            prime(i);
        }

    }

    static void prime(Integer num) {
        for (int j = 2;j < num;j++) {
            if (num%j == 0){
                break;
            }else {
                System.out.println(num);
                break;

            }
        }

    }
}

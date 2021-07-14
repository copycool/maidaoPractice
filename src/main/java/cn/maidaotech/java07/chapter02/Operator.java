package cn.maidaotech.java07.chapter02;

public class Operator {
    public static void main(String[] args) {
        Operator.snoSub(20121120);
        boolean result = Operator.year(2222);
        System.out.println(result);
        Operator.water();
    }

    private static void snoSub(Integer sno) {           //学号
        System.out.println("年份:" + (sno / 10000));
        System.out.println("月份:" + (sno % 10000 / 100));
        System.out.println("日:" + (sno % 100));
    }

    private static boolean year(int yea) {     //闰年
        if (yea % 400 == 0) {
            return true;
        }
        if (yea % 40 == 0 && yea % 100 != 0) {
            return true;
        }
        return false;
    }

    private static void water() {             //水仙花
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int num = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (num == i) {
                System.out.println(i);
            }
        }
    }
}
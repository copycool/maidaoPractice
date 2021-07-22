package cn.maidaotech.java07.chapter4.question11;
//一般而言，兔子在出生两个月后，就有繁殖能力
//一对兔子每个月能生出一对小兔子来。
//如果所有兔子都不死，那么一年后可以繁殖多少对兔子？
public class BreedingRabbit {
   /* public static void main(String[] args) {
        int rab=breed( );
    }

    private static int breed() {

        return 0;
    }*/

        public static void main(String[] args) {
            int i = 1;
            for (i = 1; i <= 20; i++) {
                System.out.println("兔子第" + i + "个月的总数为:" + f(i));
            }
        }
    
        public static int f(int x) {
            if (x == 1 || x == 2) {
                return 1;
            } else {
                return f(x - 1) + f(x - 2);
            }
        }
    }

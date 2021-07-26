package cn.maidaotech.java07.chapter02.processControl;

public class Patice09 {
    // 判断101-200之间有多少个素数，并输出所有素数。
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            if (i % 2 == 0) {
                continue;  //跳出本次循环
            }

            for (int j = 3; j <= (i + 1) / 2; j++) {
                if (i % j == 0) {
                    break;  //终止本层循环
                } else {
                    if (j == (i + 1) / 2) {
                        System.out.println(i);
                        count++;
                    }

                }
            }

        }
        System.out.println("一共有：" + count + "个素数");
    }
}
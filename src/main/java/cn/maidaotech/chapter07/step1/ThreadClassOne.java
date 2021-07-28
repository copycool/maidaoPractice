package cn.maidaotech.chapter07.step1;

//1.继承Thread类；实现输出0-10之间的奇数
public class ThreadClassOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}

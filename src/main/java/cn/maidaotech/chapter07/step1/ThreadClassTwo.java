package cn.maidaotech.chapter07.step1;

//2.实现Runnable接口。实现输出0-10之间的偶数
public class ThreadClassTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

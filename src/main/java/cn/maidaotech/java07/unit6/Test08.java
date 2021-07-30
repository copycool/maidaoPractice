package cn.maidaotech.java07.unit6;

public class Test08 {
    public static void main(String[] args) {
        PlayBasketball boy1 = new PlayBasketball(0, "李鼎凯");
        PlayBasketball boy2 = new PlayBasketball(1, "郭腾");
        new Thread(boy1).start();
        new Thread(boy2).start();
    }
}

class Basketball {// 篮球
}

class Playground {// 操场
}
class PlayBasketball implements Runnable {// 获取资源
    static Basketball basketball = new Basketball();
    static Playground playground = new Playground();
    int choice;
    String boyname;

    public PlayBasketball(int choice, String boyname) {
        this.choice = choice;
        this.boyname = boyname;
    }
    @Override
    public void run() {
        if (choice == 0) {
            synchronized (basketball) {// 第一个人获取篮球的锁
                System.out.println(this.boyname + "获得篮球的锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (playground) {// 一秒后想获得操场的锁
                    System.out.println(this.boyname + "获得操场的锁");
                }
            }

        } else {
            synchronized (playground) {// 第二个人想获得操场的锁
                System.out.println(this.boyname + "获得操场的锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (basketball) {// 两秒后想获得篮球的所
                    System.out.println(this.boyname + "获得篮球的锁");
                }
            }
        }
    }

}
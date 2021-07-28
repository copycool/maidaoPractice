package cn.maidaotech.java07.chapter07.instance.rabbitandturtle;

public class RabbitAndTurtle extends Thread {

    public RabbitAndTurtle(String name) {
        super(name);
    }

    public int distance = 10;
    static boolean flag = true;
    public int predistance = 0;

    @Override
    public void run() {

        double ran = Math.random();
        String name = Thread.currentThread().getName();
        while (flag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (name.equals("乌龟")) {
                if (ran < 1) {
                    predistance += 1;
                    System.out.println(name + "我跑了：" + predistance + "米");
                    if (predistance == 10) {
                        System.out.println("=================乌龟赢了=================");
                        flag = false;
                        break;
                    }
                }
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (name.equals("小白兔子")) {
                if (ran < 0.3) {
                    predistance += 2;
                    System.out.println(name + "我跑了：" + predistance + "米");
                    if (predistance == 10) {
                        System.out.println("=================小白兔子赢了=================");
                        flag = false;
                        break;
                    }
                }
            }
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
package cn.maidaotech.java07.chapter07.seatwork.sync;

public class HasSelfPrivateNum {

    private int num = 0;

    public void addI(String username) {
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                Thread.sleep(3000);
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num=" + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package cn.maidaotech.java07.chapter07.practice11;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        User userB = new User("用户B", 1000);
        User userA = new User("用户A", 1000, userB);
        Thread threadA = new Thread(userA);
        Thread threadB = new Thread(userB);
        threadA.start();
        // 添加join不是为了解决问题，而是让结果更直观，解决问题是增加balance字段的可见性，为其添加字段volitile让该字段修改所有线程立即可见，避免脏读。
        threadA.join();
        threadB.start();
    }
}
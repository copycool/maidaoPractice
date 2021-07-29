package cn.maidaotech.chapter07.example08;

class LockEachOther implements Runnable {
    private String lockA;
    private String lockB;

    public LockEachOther(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "lock:" + lockA + "=>get" + lockB);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "lock:" + lockB + "=>get" + lockA);

            }
        }

    }

    public static void main(String[] args) {
        String lockA = "1号锁";
        String lockB = "2号锁";
        new Thread(new LockEachOther(lockA, lockB), "T1").start();
        new Thread(new LockEachOther(lockB, lockA), "T2").start();

    }

}

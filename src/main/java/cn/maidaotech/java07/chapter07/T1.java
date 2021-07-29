package cn.maidaotech.java07.chapter07;

    public class T1 implements Runnable {
        // public static T1 t2 = new T1();
        // 设置鲜花的数量为20
        int num = 20;

        @Override
        public void run() {
            synchronized (new T1()) {
                while (num > 0) {
                    System.out.println("猴子" + Thread.currentThread().getName() + "\t菜花\t" + num--);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    public static void main(String[] args) {
		T1 t1=new T1(); 
		Thread thread = new Thread(t1);
		Thread thread1 = new Thread(t1);
		thread1.setName("B");
		thread.setName("A");
		thread.start();
		thread1.start();

    }
}
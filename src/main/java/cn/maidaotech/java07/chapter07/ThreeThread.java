package cn.maidaotech.java07.chapter07;
//现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行
public class ThreeThread implements Runnable {
    public static void main(String[] args) {

		Thread t1 = new Thread(new ThreeThread() {

			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("t1 run:"+i);
				}
				
			}
		});
		Thread t2 = new Thread(new ThreeThread() {

			@Override
			public void run() {

				for (int i = 0; i < 2; i++) {
					try {
						t1.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t2 run:"+i);
                }
				
			}
		});
		Thread t3 = new Thread(new ThreeThread() {

			@Override
			public void run() {

				for (int i = 0; i < 2; i++) {
					try {
						t2.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t3 run:"+i);
				}
				
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
}
package cn.maidaotech.java07.ch07;

public class Practice09 implements Runnable  {

	@Override
	public void run() {
		for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
		
	}
    
        public static void main(String[] args) throws  InterruptedException {
            Practice09 th1 = new Practice09();
            Practice09 th2 = new Practice09();
            Practice09 th3 = new Practice09();
            Thread thread1 = new Thread(th1); 
            Thread thread2 = new Thread(th2); 
            Thread thread3 = new Thread(th3); 
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
            thread3.start();
            thread3.join();

    }
    
}
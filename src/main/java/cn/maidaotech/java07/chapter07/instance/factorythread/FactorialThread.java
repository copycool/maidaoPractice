package cn.maidaotech.java07.chapter07.instance.factorythread;

//使用线程工厂就无需再手工编写对 new Thread 的调用了，从而允许应用程序使用特殊的线程子类、属性等
class FactorialThread extends Thread{
	private int num;
	public FactorialThread(int num) {
		this.num = num;
	}
	public void run() {
		int i = num;
		int result = 1;
		System.out.println("new thread started");
		while(i>0) {
			result*=i;
			i--;
		}
		System.out.println("The factorial of "+num+" is "+result);
		System.out.println("new thread ends");
	}
}
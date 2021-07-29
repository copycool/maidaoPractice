package cn.maidaotech.java07.chapter07;


//编写一个会导致死锁的程序。
public class Test08 {
	private final Object left = new Object();
	private final Object right = new Object();
	
	public void leftToRight() {
		synchronized(left) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (right) {
				System.out.println("得到right");
			}
		}
	}
	
	public void rightToLeft() {
		synchronized(right) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(left) {
				System.out.println("得到left");
			}
		}
	}
	public static void main(String[] args) {
		Test08 deadLock = new Test08();
	
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					deadLock.leftToRight();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					deadLock.rightToLeft();
				}
			}
		}).start();	
	}

}
//     1 函数之间不需要调用，去掉函数名，直接参数
//     2 括号后面加箭头
//     3 只有return逻辑代码，可以省去花括号和return
//     4 如果参数只有一个，可以把参数的括号省去
// 箭头函数在一些小程序unipp，一些常见的脚手架中大量使用     var sum = function(a,b){
  
    //var arr = [1,2,3,4,5,6];
    
    // var newarr = arr.map((obj)=>obj*2);
    // console.log(newarr);
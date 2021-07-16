package cn.maidaotech.java07.chapter03;

public class Computer {
    // 编写Java程序模拟简单的计算器。
    // 定义Number类，其中有两个成员变量x和y，用构造函数赋值x和y的初始值。
    // 定义加plus、减minus、乘multiply、除division等公有成员方法，分别对两个成员变量执行加减乘除的运算。
    // 在main方法中创建Number对象并调用各个方法，显示计算结果。
    private int x;
    private int y;

    public Computer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add(){
		System.out.println(x+"+"+y+"="+addition());
	}
	public void sub(){
		System.out.println(x+"-"+y+"="+subtration());
	}
	public void mult(){
		System.out.println(x+"*"+y+"="+multiplication());
	}
	public void div(){
		System.out.println(x+"/"+y+"="+division());
	}

    
    public int addition(){
		return this.x+this.y;
	}
	//减subtration
	public int subtration(){
		return this.x-this.y;
	}
	//乘multiplication
	public int multiplication(){
		return this.x*this.y;
	}
	//除division
	public double division(){
		return this.x/this.y;
	}
}
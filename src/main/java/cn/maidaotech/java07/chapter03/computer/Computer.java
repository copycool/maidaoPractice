package cn.maidaotech.java07.chapter03.computer;

public class Computer {
    // 编写Java程序模拟简单的计算器。
    // 定义Number类，其中有两个成员变量x和y，用构造函数赋值x和y的初始值。
    // 定义加plus、减minus、乘multiply、除division等公有成员方法，分别对两个成员变量执行加减乘除的运算。
    // 在main方法中创建Number对象并调用各个方法，显示计算结果。
    private Number x;
    private Number y;
	
    public Computer(Number x, Number y) {
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

    
    public Number addition(){
		return this.x.doubleValue()+this.y.doubleValue();
	}
	//减subtration
	public Number subtration(){
		return this.x.doubleValue()-this.y.doubleValue();
	}
	//乘multiplication
	public Number multiplication(){
		return this.x.doubleValue()*this.y.doubleValue();
	}
	//除division
	public double division(){
		return this.x.doubleValue()/this.y.doubleValue();
	}
}
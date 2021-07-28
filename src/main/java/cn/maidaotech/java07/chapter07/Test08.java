package cn.maidaotech.java07.chapter07;


//编写一个会导致死锁的程序。
public class Test08 {

    public static void main(String[] args) {
        Tools banShou = new Tools("扳手");
        Tools qianZi = new Tools("钳子");
 
        new Thread(() -> {
            synchronized (banShou) {
                System.out.println("线程_员工NO1,拿到扳手并锁定扳手");
                try {
                    Thread.sleep(1000);
                    banShou.execute("拧螺丝");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (qianZi) {
                    qianZi.execute("剪断钢筋");
                    System.out.println("线程_员工NO1,拿到钳子并锁定钳子");
                }
                System.out.println("线程_员工NO1完成工作并结束");
            }
        }).start();
        new Thread(() -> {
            synchronized (qianZi) {
                System.out.println("线程_员工NO2,拿到钳子并锁定钳子");
                try {
                    Thread.sleep(1000);
                    qianZi.execute("剪断钢筋");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (banShou) {
                    banShou.execute("拧螺丝");
                    System.out.println("线程_员工NO1,拿到扳手并锁定扳手");
                }
                System.out.println("线程_员工NO2完成工作并结束");
            }
        }).start();
    }
 
}

 
class Tools {
    private String name;//姓名
 
    public String execute(String operation) {
        System.out.println("拿" + name + "完成" + operation);
        return "success";
    }
 
    public Tools() {
    }
 
    public Tools(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;

}


//     1 函数之间不需要调用，去掉函数名，直接参数
//     2 括号后面加箭头
//     3 只有return逻辑代码，可以省去花括号和return
//     4 如果参数只有一个，可以把参数的括号省去
// 箭头函数在一些小程序unipp，一些常见的脚手架中大量使用     var sum = function(a,b){
  
    //var arr = [1,2,3,4,5,6];
    
    // var newarr = arr.map((obj)=>obj*2);
    // console.log(newarr);
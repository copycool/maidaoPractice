package cn.maidaotech.java07.chapter07.instance;
//利用一个Boolean变量来控制是否需要停止任务并终止线程
public class BoleanShutdown {
    public static void main(String[] args) throws Exception{        
        Runner runner = new Runner(0);        
        Thread thread = new Thread(runner);        
        thread.start();        
        Thread.sleep(200);        
        runner.cancel();    
    }
    public static class Runner implements Runnable {        
        private volatile boolean flag = true;        
        private Integer i;        
        public Runner(Integer i) {            
            super();            
            this.i = i;        
        }
        @Override        
        public void run() {            
            while (flag) {                
                try {                    
                    System.out.println(i++);                    
                    Thread.sleep(10);                
                } catch (InterruptedException e) {                    
                    e.printStackTrace();                
                }
            }        
        }
        public void cancel(){            
            this.flag = false;        
        }
    }
}
//通过调用cancle()方法修改变量flag的值可以使线程得以终止
//这种终止线程的做法显得更加安全和优雅。
//能够使线程在终止时有机会去清理资源
//而不是武断的将线程停止
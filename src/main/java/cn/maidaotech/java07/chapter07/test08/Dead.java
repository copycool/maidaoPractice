package cn.maidaotech.java07.chapter07.test08;

public class Dead implements Runnable {

    private final String str = "aaa";
    private final Integer inte = 1;
    private Boolean flag;

    
    @Override
    public void run() {
        if(flag){
            synchronized(str){
                System.out.println("str1");
                synchronized(inte){
                    System.out.println("int1");
                }
            }
           
        }else{
            synchronized(inte){
                System.out.println("int2");
                synchronized(str){
                    System.out.println("int2");
                }
            }
            
        }

    }

    public Dead(Boolean flag) {
        this.flag = flag;
    }

}

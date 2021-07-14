package cn.maidaotech.java07.chapter01;

// import java.lang.Thread.State;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("第一章");
        helloworld hw= new helloworld();
        helloworld.method();
        // String 是 final  对象不可变 str是变量 现在str变量指向“迈道”这个对象
        String str="迈道";
        //str变量指向另一个对象“迈道科技”
        str += "科技";    
        System.out.println(str);   
        
        for(int i=0;i<1000;i++){
            //创建一千个对象
            str+=i;
        }
        Object obj=new String("maidao");
        if(obj instanceof String){
            System.out.println("是字符串类型");
        }
    }

    {
        System.out.println("非静态代码块");
    }
    private static void method(){
        System.out.println("静态");
    }
}

package cn.maidaotech.java07.chapter03;

import java.util.Date;

import cn.maidaotech.java07.chapter01.People;

public class PeopleTest {
    public static void main(String[] args) {

        //abstract不允许实例化对象，下面一句会报错
        //People p1 = new People("41010101199006011234","张三",29);

        //people是abstract，不能实例化，
        //worker不是abstract，所以可以实例化，
        //因为worker继承自people，所以worker可以获取perple的属性
        Worker s = new Worker("2","王师傅",56,6000);
        Worker w = new Worker("1","刘师傅",45,7000); 
        
        Worker p = new Worker("2","孙师傅",30,6700);        
        System.out.println(w.toString());        
        System.out.println(p.toString());    
        System.out.println(s);  
      
    }
    
}
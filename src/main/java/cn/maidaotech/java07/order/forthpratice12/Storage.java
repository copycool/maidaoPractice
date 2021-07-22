package cn.maidaotech.java07.order.forthpratice12;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.style.ToStringCreator;

public class Storage {
   public static void main(String[] args) {
       Map<Integer,Person>map=new HashMap<Integer,Person>();
       Person a = new Person("王银胜", 234.5,12);
       map.put(12,a);
      System.out.println(map.get(12).toString()); 
   }
}
class Person{
       String name;
       double balance;
       int id;
       public Person(String name,double balance,int id){
                   this. name =name;
                   this.balance=balance;
                   this.id = id ;
                }
    @Override
    public String toString() {
        return " [balance=" + balance + ", id=" + id + ", name=" + name + "]";
    }
     

   }




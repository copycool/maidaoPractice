package cn.maidaotech.java07.chapter03.dog;

public class DogTest {
    public static void main(String args[]){
       
        Dog[] dogs=new Dog[5];
        dogs[0]=new Dog("小花","黑白",2);
        dogs[1]=new Dog("阿黄","黄色",1);
        dogs[2]=new Dog("小黑","黑色",3);
        dogs[3]=new Dog("啸天","黑黄",4);
        dogs[4]=new Dog("马虎","黑色",5);
        for (Dog dog : dogs) {
            // dog.print();
            System.out.println(dog.toString());
            
        }
    }
}
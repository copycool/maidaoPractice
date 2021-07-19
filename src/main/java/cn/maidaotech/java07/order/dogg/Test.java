package cn.maidaotech.java07.order.dogg;

public class Test {
    public static void main(String[] args) {
         
   Dog[]dogs= new Dog[3];
   Dog li = new Dog();
   for(int i=0;i<3;i++){
      li.setName("dahei");
      li.setAge("shier");
      li.setColoer("heise");
       dogs[i]=li;
   }
   for(int j=0;j<dogs.length;j++){
    System.out.println( "====================");
    
    System.out.println( dogs[0].getName());
    System.out.println( dogs[1].getAge());
   System.out.println( dogs[2].getColoer());
   System.out.println(">>>>>>>>>>>>>>>>>>>");
}
}
}

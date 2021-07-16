package cn.maidaotech.java07;


public class Java03_3_10_1 {
    public static void main(String[] args) {
        Address p=new Address();
        
        p.setCountries("中国");
        p.setCity("郑州市");
        p.setPostcode(6666);
        p.setProvince("河南省");
        p.setStreet("新郑市");
        System.out.println(p.getCountries()+p.getProvince()+p.getCity()+p.getStreet()+p.getPostcode());



        Dog dog1= new Dog("哈士奇","蓝色",2);
        Dog[] dogs={new Dog("萨摩耶", "白色", 1),new Dog("阿拉斯加", "黄色", 5), new Dog("柴犬", "紫色", 7)};
        for (Dog dog : dogs) {
            outPut(dog);
        }
    }
       
    
        
    
   public static void outPut(Dog dog){
        System.out.println("品种:"+dog.getName());
        System.out.println("颜色:"+dog.getColour());
        System.out.println("年龄:"+dog.getAge());
   }
}
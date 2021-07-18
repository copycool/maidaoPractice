package cn.maidaotech.java07.chapter03;





public class Test  {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("中国");
        address.setProvince("菏泽");
        address.setCity("曹县");
        address.setStreet("ttt");
        address.setDetail("dddd");
        address.setCode(6666);
        System.out.println(address.allMessage());
        
        Dog[]dogs = new Dog[3];
        dogs[0] = new Dog("白色","旺财", 3);
        dogs[1] = new Dog("粉色","毛球", 1);
        dogs[2] = new Dog("紫色","富贵", 2);
        for(Dog dog : dogs){
            System.out.println(dog.message());
        }

        Number num = new Number(0, 5);
        System.out.println(num.getX() + "+" + num.getY() + "=" + num.plus());
        System.out.println(num.getX() + "-" + num.getY() + "=" + num.minus());
        System.out.println(num.getX() + "*" + num.getY() + "=" + num.multiply());
        System.out.println(num.getX() + "/" + num.getY() + "=" + num.division());

        Student mess = new Student("name", "address", new Byte("1"), 2,44, 33);
        System.out.println(mess.message());

       
        



      
    }

}
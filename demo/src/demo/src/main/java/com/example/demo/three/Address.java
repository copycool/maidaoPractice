package com.example.demo.three;

public class Address {
    public void address(){
        System.out.println("地址是；");
    }
    public static void main(String[] args) {
        Address a = new Address();
        Address b = new Nation();
        Address c = new Sheng();
        Address d = new City();
        Address e = new Street();
        Address f = new Postcode();
      
        a.address();
        b.address();
        c.address();
        d.address();
        e.address();
        f.address();
    }

    
}
class Nation extends Address{
    public void address(){
        System.out.println("中国");
    }
}
class Sheng extends Nation{
    public void address(){
        System.out.println("河南");
    }
}

class City extends Sheng{
    public void address(){
        System.out.println("郑州");
    }
}

class Street extends City{
    public void address(){
        System.out.println("双湖大道");
    }
}
class Postcode extends Street{
    public void address(){
        System.out.println("123455");
    }
}



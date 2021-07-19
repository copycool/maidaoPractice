package cn.maidaotech.java07.chapter03.address;

public class AddressTest {
    public static void main(String args[]){
        Address a=new Address("中国","广东省","东莞市","松山湖114号","522101");
        Address b=new Address("中国","广东省","东莞市","松山湖114号","522101");
        Address c=new Address("中国","广东省","东莞市","松山湖114号","522101");

        
        a.print();
        b.print();
        c.print();

    }
    
}
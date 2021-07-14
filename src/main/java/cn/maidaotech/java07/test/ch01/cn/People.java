package cn.maidaotech.java07.test.ch01.cn;

public class People {
    private String name;

    public People(String name){
        this.name=name;
    }


    public static void main(String[] args) {
        People tiantian=new People("田田");
        People chenchen=new People("晨晨");
        System.out.println( tiantian.name+"喜欢"+ chenchen.name);
    }
}

package cn.maidaotech.java07;


public class ChineseTest {
    public static void main(String[] args){
    
    
    Chinese zhangsan = new Chinese("1","zhangsan","中国");
    System.out.println(zhangsan.id + "," + zhangsan.name +"," +zhangsan.country);
    Chinese lisi = new Chinese("2","lisi","中国");
    System.out.println(lisi.id + "," + lisi.name +"," +lisi.country);
}
}
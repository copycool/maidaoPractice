package cn.maidaotech.java07.order.human1;

import cn.maidaotech.java07.order.model.Product;

public class Test {

    public static void main(String[] args) {
//        Student p1 = new Student(23, 34);
//        System.out.println(p1.getMath());
//        System.err.println(p1.getEnglish());
// }
// }
 Product[] arrayPro = new Product[3];//创建大小3的数组arrayPro
 for(int i =0;i<3;i++){
    Product pro1 = new Product();//创建对象pro1
    pro1.setTradeName("aggg");//赋值“aggg”
    arrayPro[i]=pro1;//循环i次 i个“aggg”

 }
for(int j = 0;j<arrayPro.length;j++){
    System.out.println( arrayPro[j].getTradeName());//遍历j次数组；获得
}
}
}
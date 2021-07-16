package cn.maidaotech.java07.chapter03.order.utils;

import cn.maidaotech.java07.chapter03.order.model.Product;

public  class dataUtils {
    public static Product[] productData(){
        Product[] products= new Product [6];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
        }
        products[0]=new Product("小米手机",5500,100);
        products[1]=new Product("华为手机",6500,200);
        products[2]=new Product("苹果手机",7500,100);
        products[3]=new Product("短袖",50,50);
        products[4]=new Product("裙子",100,30);
        products[5]=new Product("鞋",230,120);

        return products;
    }
}

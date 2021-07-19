package cn.maidaotech.java07.order.moder;

public class Product {
    // 其中 Product 类至少有名称、价格和库存数量等属性，
    String name;
    int price;
    int num; 
    public Product(String name,int price,int num){
        this.name=name;
        this.price=price;
        this.num=num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
}

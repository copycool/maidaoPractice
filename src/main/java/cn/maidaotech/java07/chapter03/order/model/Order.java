package cn.maidaotech.java07.chapter03.order.model;

public class Order {
    //Order类包含购买的什么商品和数量等属性
    private String byeSpecies;
    private int buyCount;

    public Order() {
    }
    
    public Order(String byeSpecies, int buyCount) {
        this.byeSpecies = byeSpecies;
        this.buyCount = buyCount;
    }

    public String getByeSpecies() {
        return byeSpecies;
    }

    public void setByeSpecies(String byeSpecies) {
        this.byeSpecies = byeSpecies;
    }

    public int getByeCount() {
        return buyCount;
    }

    public void setByeCount(int byeCount) {
        this.buyCount = byeCount;
    }

    @Override
    public String toString() {
        return "Order [buyCount=" + buyCount + ", byeSpecies=" + byeSpecies + "]";
    }



}
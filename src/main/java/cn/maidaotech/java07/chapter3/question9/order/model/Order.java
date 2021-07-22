package cn.maidaotech.java07.chapter3.question9.order.model;
//Order类包含购买的什么商品和数量等属性
public class Order {
    private String goodsPurchased;
    private Integer  numbe;
    public Order(){

    }
    public Order(String goodsPurchased,Integer number){
        this.goodsPurchased=goodsPurchased;
        this.numbe=number;
    }
    public void setGoodsPurchased(String goodsPurchased) {
        this.goodsPurchased = goodsPurchased;
    }
    public String getGoodsPurchased() {
        return goodsPurchased;
    }
    public void setNumbe(Integer numbe) {
        this.numbe = numbe;
    }
    public Integer getNumbe() {
        return numbe;
    }
}
package cn.maidaitech.shui966.Char3.order.model;
/*Product类至少有名称、价格和库存数量等属性， */
public class Product {
    private String shopname;
    private String price;
    private String StockQty;
    public Product(){

    }
    public Product(String shopname,String price,String StockQty){
        this.shopname=shopname;
        this.price=price;
        this.StockQty=StockQty;
    }
    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    public String getShopname() {
        return shopname;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return price;
    }
    public void setStockQty(String stockQty) {
        StockQty = stockQty;
    }
    public String getStockQty() {
        return StockQty;
    }

}
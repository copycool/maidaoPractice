package cn.maidaotech.java07.chapter03.order.model;

public class Product {
    //其中Product类至少有名称、价格和库存数量等属性
    private String productName;
    private String productPrice;
    private int productCount;

    public Product() {
    }

    public Product(String productName, String productPrice, int productCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

  


  

   

}
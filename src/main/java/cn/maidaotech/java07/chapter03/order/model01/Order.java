package cn.maidaotech.java07.chapter03.order.model01;

import cn.maidaotech.java07.chapter03.order.model.Account;
import cn.maidaotech.java07.chapter03.order.model.Product;

public class Order {
    private Product product;//商品类型
    private Integer productSum;//商品数量
    private Account account;

    public Order() {
    }

    public Order(Product product, Integer productSum, Account account) {
        this.product = product;
        this.productSum = productSum;
        this.account = account;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getProductSum() {
        return productSum;
    }

    public void setProductSum(Integer productSum) {
        this.productSum = productSum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    


    
}

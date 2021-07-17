package cn.maidaotech.java07.work3.order.model;



// Product类至少有名称、价格和库存数量等属性，
public class Product {
    private String name;
    private Integer charge;
    private Integer store;

    public Product() {
    }

    public Product(String name,Integer charge,Integer store) {

        this.name=name;
        this.charge=charge;
        this.store=store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

}

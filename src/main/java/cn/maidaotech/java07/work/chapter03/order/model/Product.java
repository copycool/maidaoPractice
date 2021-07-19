package cn.maidaotech.java07.work.chapter03.order.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    
    private Integer id;            //商品Id

    private Integer categoryId;    //类目Id

    private String name;           //商品名称
 
    private String mainImage;      //商品图片

    private BigDecimal price;      //商品单价

    private Integer stock;         //商品库存

    private Integer status;        //商品状态    0--售罄  1--在售  2--未上架

    private Date createTime;       //商品上架时间

    private Date updateTime;       //商品更新时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Product [categoryId=" + categoryId + ", createTime=" + createTime + ", id=" + id + ", mainImage="
                + mainImage + ", name=" + name + ", price=" + price + ", status=" + status + ", stock=" + stock
                + ", updateTime=" + updateTime + "]";
    }

    public String   printName(){
        return name;
    }
    
}
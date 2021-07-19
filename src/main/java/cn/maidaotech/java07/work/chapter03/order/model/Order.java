package cn.maidaotech.java07.work.chapter03.order.model;

import java.math.BigDecimal;
import java.util.Date;

import cn.maidaotech.java07.work.chapter03.order.data.TestData;

public class Order {

    private Long id;              //订单id

    private Long orderNo;            //订单号

    private Integer accountId;      //用户id

    private Integer productId;       // 商品Id

    private BigDecimal payment;       //支付金额

    private Integer status;          //订单状态  0--未支付   1--支付

    private Date paymentTime;

    private Date closeTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Order [id="+ id + ", orderNo=" + orderNo + ", accountId=" + accountId + ", productId="
                + productId + ", payment=" + payment + ", status=" + status + ", paymentTime=" + TestData.timeFormat(paymentTime) + ", createTime="
                + TestData.timeFormat(createTime) + ", closeTime=" + TestData.timeFormat(closeTime) + "]";
    }




    
}
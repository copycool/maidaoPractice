package cn.maidaotech.java07.order.order.model;
//Account类包含账户名称、剩余金额等属性
public class Account {
  private  String accounttitle;
  private  double remainingamount;
    public Account(String accounttitle,double remainingamount){
        this.accounttitle=accounttitle;
        this.remainingamount=remainingamount;
    }
    public String getAccounttitle() {
        return accounttitle;
    }
    public void setAccounttitle(String accounttitle) {
        this.accounttitle = accounttitle;
    }
    public double getRemainingamount() {
        return remainingamount;
    }
    public void setRemainingamount(double remainingamount) {
        this.remainingamount = remainingamount;
    }
    @Override
    public String toString() {
        return "Account [accounttitle=" + accounttitle + ", remainingamount=" + remainingamount + "]";
    }
    
}

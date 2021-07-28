package cn.maidaotech.chapter07.practice11;

import java.util.Objects;

//银行
public class Bank {
    static double money = 1000;
    //柜台取钱
    private void Counter(double money){
      Bank.money -= money;//Bank.money = Bank.money - money
      System.out.println("柜台取钱"+money+"元，剩余："+Bank.money+"元");

    }
    //ATM取钱
    private void ATM(double money){
        Bank.money -= money;//Bank.money = Bank.money - money
      System.out.println("ATM取钱"+money+"元，剩余："+Bank.money+"元");

    }
    public synchronized void outMoney(double money,String mode) throws Exception{
        if(money > Bank.money){
            //看余额是否充足
            throw new Exception("取款金额:"+money+",余额只剩:"+Bank.money+"取款失败");

        }
        if(Objects.equals(mode, "ATM")){
            ATM(money);
        }else{
            Counter(money);
        }
    }
}
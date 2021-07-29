package cn.maidaotech.java07.seven.bank;
// 银行抽象为类，柜台汇款和 ATM 机取款抽象为方法 
// a. 用户 A 和 B 抽象为两个线程类 b.
//  确保 A 和 B 同时操作时 B 的账户金额的正确性
public class Bank {
      public void Deposit(Account account,Integer amount) throws Exception {
          if(account==null){
           throw new Exception("the account is invalid");
          }    
          if(amount==null||amount<=0) {
            throw new Exception("the account is invalid");
          }synchronized(account){
              account.setBalance(account.getBalance() + amount);
          }   
      }
      public void WithDraw(Account account,Integer amount) throws Exception {
        if(account==null){
            throw new Exception("the account is invalid");
           }    
           if(amount==null||amount<=0) {
             throw new Exception("the account is invalid");
            }
             if(account.getBalance().compareTo(amount)<0) {
             throw new Exception("the balance is not enough");            
           }synchronized(account){
               account.setBalance(account.getBalance() - amount);
           }  
      }
    }

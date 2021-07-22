package com.example.three.order.model;

public class Account {
    public Account(){
        
    }
    private String title;
    private int money;
    public Account(String title,int money){
        this.title = title;
        this.money = money;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
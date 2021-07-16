package cn.maidaotech.java07.chapter03;

import java.util.Date;

public class Mobile extends Product implements Comparable<Mobile>{
 
    public Mobile() {
    }

    public Mobile(String name, double price, Date creatAt) {
        super(name, price, creatAt);
    }

    @Override
    public int compareTo(Mobile o) {
        if(this.getPrice()>o.getPrice()){
            return 1;
        }
        else if(this.getPrice()<o.getPrice()){
            return -1;
        }
        return 0;
    }
    
}

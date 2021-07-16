package cn.maidaotech.java07.chapter03;

import java.util.Date;

public class Mobile extends Product  {

    private String size;

    public Mobile() {
        super();
    }

    public Mobile(String name, float price, Date createdDate) {
        super(name, price, createdDate);
    }

    public Mobile(String name, float price, String size, Date createdDate) {
        super(name, price, createdDate);
        this.size = size;
    }


    @Override
    public String getName() {
        return super.getName() + getPrice();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}

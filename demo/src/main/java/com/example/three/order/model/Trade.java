package com.example.three.order.model;

public class Trade {
    public Trade(){

    }
    private int many;
    private String what;
    public Trade(int many,String what){
        this.many = many;
        this.what = what;
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
    
    
}
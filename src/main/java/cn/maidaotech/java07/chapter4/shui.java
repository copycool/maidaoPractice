package cn.maidaotech.java07.chapter4;

import java.util.HashMap;

public class shui {
    public static void main(String[] args) {
        
    }
    public void test() {
        HashMap<ProductKey,Product>=new HashMap<>();
        map.put(new ProductKey("baise","170"),100);
        System.out.println(map.get(new ProductKey("baise","170")));
    }
    class ProductKey{
        String color;
        String size;
    }

        public void ProductKey(String color, String size) {
            this.color=color;
            this.size=size;

        }
    
}
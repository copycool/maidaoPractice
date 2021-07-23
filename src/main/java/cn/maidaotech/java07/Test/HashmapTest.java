package cn.maidaotech.java07.Test;

import java.util.HashMap;

// import cn.maidaotech.java07.chapter03.order.model.Product;

public class HashmapTest {
    public static void main(String[] args) {
        new HashmapTest().test();
    }

    public void test() {
        HashMap<ProductKey, Integer> map = new HashMap<>();
        map.put(new ProductKey("color", "size"), 1000);
        System.out.println(map.get(new ProductKey("color", "size")));
    }

    class ProductKey {
        String color;
        String size;

        public ProductKey(String color, String size) {
            this.color = color;
            this.size = size;

        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((color == null) ? 0 : color.hashCode());
            result = prime * result + ((size == null) ? 0 : size.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ProductKey other = (ProductKey) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (color == null) {
                if (other.color != null)
                    return false;
            } else if (!color.equals(other.color))
                return false;
            if (size == null) {
                if (other.size != null)
                    return false;
            } else if (!size.equals(other.size))
                return false;
            return true;
        }

        private HashmapTest getEnclosingInstance() {
            return HashmapTest.this;
        }
        
    }

    
    

}

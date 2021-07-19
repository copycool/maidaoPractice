package cn.maidaotech.java07.chapter04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashmapTest {
    public static void main(String[] args) {
        new HashmapTest().test();
    }

    public void test() {
        HashMap<ProductKey, Integer> map = new HashMap<>();
        map.put(new ProductKey("白色", "170"), 100);
        System.out.println(map.get(new ProductKey("白色","170")));
        Set<Map.Entry<ProductKey,Integer>> set = map.entrySet();
        Iterator<Map.Entry<ProductKey,Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<ProductKey,Integer> entry = iterator.next();
            entry.getKey();
            entry.getValue();
        }
        for (Entry<ProductKey,Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
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

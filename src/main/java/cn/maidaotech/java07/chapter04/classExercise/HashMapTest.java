package cn.maidaotech.java07.chapter04.classExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        new HashMapTest().test();
    }

    public void test() {
        HashMap<ProductKey, Integer> map = new HashMap<>();
        map.put(new ProductKey("red", "170"), 100);
        // 必须重写equals和hascode 打印出来才是100
        System.out.println(map.get(new ProductKey("red", "170")));
        Set<Map.Entry<ProductKey, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<ProductKey, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<ProductKey, Integer> item = iterator.next();
            item.getKey();
            item.getValue();
        }
        for (Map.Entry<ProductKey, Integer> entry2 : map.entrySet()) {
            entry2.getKey();
            entry2.getKey();
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

        private HashMapTest getEnclosingInstance() {
            return HashMapTest.this;
        }

    }
}

package cn.maidaotech.java07.chapter03;

import java.util.Comparator;

public class MobileComparator implements Comparator<Mobile> {
    public int compare(Mobile o1, Mobile o2) {
        return o1.getPrice() > o2.getPrice() ? 1 : o1.getPrice() < o2.getPrice() ? -1 : 0;
    };
}

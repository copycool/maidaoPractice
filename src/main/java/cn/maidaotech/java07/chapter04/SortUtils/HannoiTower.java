package cn.maidaotech.java07.chapter04.SortUtils;

public class HannoiTower {
    //汉诺塔
    static int num = 0;

    public static void main(String[] args) {
        tower(5, "a", "b", "c");
        System.out.println(num);
    }
    // n碟子数量，从柱子a移动到柱子c

    public static void tower(int n, String a, String b, String c) {

        if (n == 1) {
            System.out.println(a + "-->" + c);
            num += 1;
        } else {
            tower(n - 1, a, c, b);
            System.out.println(a + "-->" + c);
            num += 1;
            tower(n - 1, b, a, c);
        }
    }
}
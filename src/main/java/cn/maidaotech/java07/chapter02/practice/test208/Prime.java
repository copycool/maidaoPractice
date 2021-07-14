package cn.maidaotech.java07.chapter02.practice.test208;

public class Prime {
    public static int total() {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            int cur = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
                cur++;
            }
            if (cur == i - 2)
                count++;
        }
        return count;
    }
}
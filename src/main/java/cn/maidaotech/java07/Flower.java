package cn.maidaotech.java07;

public class Flower {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {

			// 提取百位
			int baiwei = i / 100;

			// 提取十位
			int shiwei = i / 10 % 10;

			// 提取个位
			int gewei = i % 10;

			// 符合条件的数字输出
			if (i == (baiwei * baiwei * baiwei + shiwei * shiwei * shiwei + gewei * gewei * gewei)) {

				System.out.println(i + "\t");
			}
        }    
    }
}

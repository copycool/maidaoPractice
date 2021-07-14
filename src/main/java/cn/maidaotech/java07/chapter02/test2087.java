package cn.maidaotech.java07.chapter02;

public class test2087 {
    // 用字符“*”打印一个边长为100个*的空心正方形
    public static void main(String[] args) {
        char[][] nums = new char[100][100];
        int i = 0, j = 0;

        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                nums[i][j] = ' ';
            }
        }

        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                if (j == 0 || j == 99) {
                    nums[i][j] = '*';
                }
            }
            if (i == 0 || i == 99) {
              for(j=0;j<100;j++){
                nums[i][j] = '*';
                }
            }
        }


        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

    }

}

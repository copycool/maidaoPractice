package cn.maidaotech.bookexample;

public class Diamond {
    public static void main(String[] args) {
        int i;
        int k;
        int j;
        int n=10;
        for (i = 1; i <= n; i++)// i是从上往下数的行数
        {
            k = n - i;// 每次输出的空格数k应该是n-i个
            while ((k--)!=0)// 每次输出i-1个空格
                System.out.print(" ");
            if (i == 1)// 当是第1行，输出完n-1空格后输出一个*
                System.out.print("*");
            else// 其他行都是两个*中间加（2*i-1）个空格
            {
                System.out.print("*");
                for (j = 1; j <= 2 * i - 3; j++)// 比如第二行应该是1个空格
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();// 输出完一行之后换一次行
        }
        for (i = n - 1; i >= 1; i--)// i是从下往上数的行数
        {
            k = n - i;// 每次输出的空格数应该是n-i个
            while ((k--)!=0)// 每次输出i-1个空格
                System.out.print(" ");
            if (i == 1)// 当是第1行，输出完n-1空格后输出一个*
                System.out.print("*");
            else// 其他行都是两个*中间加（2*i-3）个空格
            {
                System.out.print("*");
                for (j = 1; j <= 2 * i - 3; j++)// 比如倒数第二行应该是1个空格
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
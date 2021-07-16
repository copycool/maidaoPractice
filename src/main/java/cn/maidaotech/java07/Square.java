package cn.maidaotech.java07;

public class Square {
    public static void main(String[] args) {
        /* 乘法表 */
        /*
         * for (int i = 1; i <=9; i++) { for (int j = 1; j <=9; j++) { if (i<=j) {
         * System.out.print(i+"X"+j+"="+i*j+"   "); } if (j==9) { 
         * System.out.println(""); } } }
         */

        /* 素数 */
        /*
         * for (int i = 101; i<=200; i++) { for (int j = 2; j<i/2; j++) { if (i%j==0) {
         * break; }else{ System.out.println(i); break; } } }
         * 
         * {
         */
       /*  输出空心正方形
        for (int i = 0; i<100; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <98; i++) {
            for (int j = 0; j <100; j++) {
                switch (j) {
                    case 0:
                    System.out.print("*");
                       break;
                    case 99:
                    System.out.println("*");
                       break;
                    default:
                    System.out.print(" ");
                       break;
                }
                
            }
        }
        for (int i = 0; i<100; i++) {
            System.out.print("*");
        } */
        //菱形
        int size=5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i <= size-1; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print(" ");
			}
			
			for (int k = 2*size-3; k >= 2 * i - 1; k--){
				System.out.print('*');
			}
			System.out.println();
		}

    }
}

package cn.maidaotech.java07.zuoye;

//1-9不能填4,6,2；
// 第三位4 第四位6第六位2；
import java.util.Arrays;

public class ShuZi {
    public static void main(String[] args) {
        int[] array = { 0, 0, 4, 6, 0, 2, 0, 0, 0 };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(fill(array)));
    }
    /*
     * 当i=0时 ,跳出本次循环，继续循环；
     *  当i=1时，fillNumber=1；调用exist（array，1），fillNumber+1=2；
     * 当i=2时，fillNumber+1=2；
     */

    public static int[] fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                continue;
            }
            int fillNumber = 1;
            while (exist(array, fillNumber)) {
                fillNumber++;
            }
            array[i] = fillNumber;
        }
        return array;
    }

    public static boolean exist(int[] array, int number) {
        // 增强for循环
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}

package cn.maidaotech.java07.chapter04.SortUtils;

public class Speed {
    // 快速排序
    public static void quickSort(int a[], int left, int right) {
        if (left >= right)
            return;
        int i = left;
        int j = right;
        int key = a[left];// 选择第一个数为 key
        while (i < j) {
            while (i < j && a[j] >= key) {// 从右向左找第一个小于 key 的值
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }
            while (i < j && a[i] < key) {// 从左向右找第一个大于 key 的值
                i++;
            }
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        // i == j
        a[i] = key;
        quickSort(a, left, i - 1);// 递归调用
        quickSort(a, i + 1, right);// 递归调用
    }

}
package cn.maidaotech.java07.chapter04.test;

import java.util.Arrays;

public class SortTest {
    static class MpSort {
        public static int[] sort(int[] arr) {
            int item;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        item = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = item;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args) {
            Arrays.stream(sort(new int[] { 1, 5, 7, 2, 4, 1, 2, 3, 4 })).forEach(o -> System.out.println(o));
        }
    }

    static class SelectSort {
        public static int[] sort(int[] arr) {
            int len = arr.length;
            int minIndex, temp;
            for (int i = 0; i < len; i++) {
                minIndex = i;
                for (int j = i + 1; j < len; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            return arr;
        }

        public static void main(String[] args) {
            Arrays.stream(sort(new int[] { 1, 5, 7, 2, 4, 1, 2, 3, 4 })).forEach(o -> System.out.println(o));
        }

    }

    static class Merge {
        public static int[] sort(int[] a, int low, int high) {
            // 1.取中间值
            int mid = (low + high) / 2;
            // 2.临界条件：不能再二分
            if (low < high) {
                // 对a的左侧进行归并排序
                sort(a, low, mid);
                // 对a的右侧进行归并排序
                sort(a, mid + 1, high);
                // 左右归并
                merge(a,low,mid,high);
            }
            return a;
        }
        public static void merge(int[] a,int low,int mid,int high){
            int[] temp = new int[high - low + 1]; //辅助数组；
            int i = low;
            int j = mid + 1;
            int k = 0;
            // 把较小的数先移到新数组中
            while(i <= mid && j <= high){
                if(a[i] < a[j]){
                    temp[k++] = a[i++];
                }else{
                    temp[k++] = a[j++];
                }
            }
            while(i <= mid){
                temp[k ++] = a[i ++];
            }
            while(j <= high){
                temp[k ++] = a[j ++];
            }
            for(int x = 0;x < temp.length;x ++){
                a[x + low] = temp[x];
            }
        }

        public static void main(String[] args) {
            Arrays.stream(sort(new int[] { 8, 5, 7, 2, 4, 1, 2, 3, 4 },0,6)).forEach(o -> System.out.println(o));
        }
    }

}
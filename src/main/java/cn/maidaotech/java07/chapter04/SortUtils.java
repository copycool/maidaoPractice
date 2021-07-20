package cn.maidaotech.java07.chapter04;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

//编写一个工具类 SortUtils.java，
//其中有放冒泡排序、选择排序、插入排序、归并排序和快速排序
//五种排序算法对 List 集合进行排序。
public class SortUtils {
    public static void main(String[] args) {
        int t=1;
        LinkedList<Integer> link = new LinkedList<>();
        while(t!=6){
            link.clear();
            for (int i = 0; i < 10; i++) {
                link.add(new Random().nextInt(100));
            }
            Integer[] arr = new Integer[link.size()];
            arr = link.toArray(arr);
            System.out.print("排序前的随机数据为：");
            for (Integer item : arr) {
                System.out.print(item + "——");
            }
            System.out.println();
            t = sysSort(arr);
        }
    }

    public static void bubbleSort(Integer[] arr){
        System.out.println("您选择的是冒泡排序");
            for(int i=1;i<arr.length;i++){		
                for(int j=0;j<arr.length-i;j++){	
                    if(arr[j]>arr[j+1]){	
                        int temp=arr[j];			
                        arr[j]=arr[j+1];	
                        arr[j+1]=temp;			
                    }
                }
                System.out.print("第"+i+"趟排序后，数组为:");
                for(int temp:arr){				
                    System.out.print(temp+"——");
                }
                System.out.println();  
            }       	
    }
    public static void selectSort(Integer[] arr){
        System.out.println("您选择的是选择排序");
        for(int i=0; i<arr.length; i++){
            int mark = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[mark]){
                    mark = j;
                }
            }
            int temp = arr[mark];
            arr[mark] = arr[i];
            arr[i] = temp;
            System.out.print("第"+(i+1)+"趟排序后，数组为:");
            for(int item:arr){				
                System.out.print(item+"——");
            }
            System.out.println();  
        }

    }
    public static void insertSort(Integer[] arr){
        System.out.println("您选择的是插入排序");
        for(int i=1; i<arr.length; i++){
            int pre = i-1;
            int current = arr[i];
            while(pre>=0&&current<arr[pre]){
                    arr[pre+1]=arr[pre];
                    pre--;
            }
            arr[pre+1] = current;
            System.out.print("第"+i+"趟排序后，数组为:");
            for(int item:arr){				
                System.out.print(item+"——");
            }
            System.out.println();  
        }
    }
    public static void mergeSort(int [] a,int start,int end){
        if(start<end){//当子序列中只有一个元素时结束递归
            int mid=(start+end)/2;//划分子序列
            mergeSort(a, start, mid);//对左侧子序列进行递归排序
            mergeSort(a, mid+1, end);//对右侧子序列进行递归排序
            merge(a, start, mid, end);//合并
        }
    }
    public static void merge(int []a,int left,int mid,int right){
        int []tmp=new int[a.length];//辅助数组
        int p1=left,p2=mid+1,k=left;//p1、p2是检测指针，k是存放指针

        while(p1<=mid && p2<=right){
            if(a[p1]<=a[p2])
                tmp[k++]=a[p1++];
            else
                tmp[k++]=a[p2++];
        }

        while(p1<=mid) tmp[k++]=a[p1++];//如果第一个序列未检测完，直接将后面所有元素加到合并的序列中
        while(p2<=right) tmp[k++]=a[p2++];//同上

        //复制回原素组
        for (int i = left; i <=right; i++) {
            a[i]=tmp[i];
        }
        System.out.print("归并本趟排序后数组为");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+"——");
        }
        System.out.println();
    }
    public static void quickSort(int a[], int left, int right){
        if (left >= right) 
        return; 
        int i = left;
        int j = right; 
        int key = a[left];//选择第一个数为 key 
        while (i < j) { 
            while (i < j && a[j] >= key) {//从右向左找第一个小于 key 的值       
            j--; 
            }
        if (i < j) { 
            a[i] = a[j]; 
            i++; 
        }
        while (i < j && a[i] < key) {//从左向右找第一个大于 key 的值 
            i++; 
        }
        if (i < j) { 
            a[j] = a[i]; 
            j--; 
        } 
    }//i == j 
    a[i] = key; 
    quickSort(a, left, i - 1);//递归调用 
    quickSort(a, i + 1, right);//递归调用 
    System.out.print("本趟归并排序后数组为");
    for(int k=0; k<a.length; k++){
        System.out.print(a[k]+"——");
    }
    System.out.println();
}
    
   
    public static int sysSort(Integer[] arr) {
        int command;
            System.out.println("*********执行菜单*********");
            System.out.println("********1.冒泡排序********");
            System.out.println("********2.选择排序********");
            System.out.println("********3.插入排序********");
            System.out.println("********4.归并排序********");
            System.out.println("********5.快速排序********");
            System.out.println("********6.退出排序********");
            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();
            if (in == 1) {
                command=1;
                bubbleSort(arr);
                System.out.println("=========================");
            } else if (in == 2) {
                command=2;
                selectSort(arr);
                System.out.println("=========================");
            } else if (in == 3) {
                command=3;
                insertSort(arr);
                System.out.println("=========================");
            } else if(in == 4) {
                command=4;
                System.out.println("您选择的是归并排序");
                int[] arre = new int[arr.length]; 
                for(int i=0; i<arr.length; i++){
                arre[i] = arr[i].intValue();
                }
                mergeSort(arre, 0, arre.length-1);
                System.out.println("归并排序后的数组：");
                for (int e : arre){
                    System.out.print(e+"——");
                }
                System.out.println();
                System.out.println("=========================");
            } else if(in == 5) {
                command=5;
                System.out.println("您选择的是快速排序");
                int[] arre = new int[arr.length]; 
                for(int i=0; i<arr.length; i++){
                arre[i] = arr[i].intValue();
                }
                quickSort(arre, 0, arr.length-1);
                System.out.println("快速排序后的数组：");
                for (int e : arre){
                    System.out.print(e+"——");
                }
                System.out.println();
                System.out.println("=========================");
            }else if(in == 6){
                command=6;
                System.out.println("您已成功退出！");
            } else {
                System.out.println("您输入的数字非法，请重新输入：");
                System.out.println("=========================");
                command=0;
            }
        
        return command;
    }

}



//实现compareTo接口
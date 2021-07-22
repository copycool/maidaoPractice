package cn.maidaotech.chapter04;

public class TableSizeForExample {
    
public static void main(String[] args) {
    //HashMap中的tableSizeFor的算法举例解释
    int n = 1000 - 1;  //999-->1111100111
     n |= n >>> 1;           //1111100111 0111110011 -->1111110111
     n |= n >>> 2;           //1111110111 0011111101 -->1111111111
     n |= n >>> 4;           //1111111111 0000111111 -->1111111111
     n |= n >>> 8;           //1111111111 0000000011 -->1111111111
     n |= n >>> 16;          //1111111111 0000000000 -->1111111111
    System.out.println(n+1); //返回-->10000000000
}
}
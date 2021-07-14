package cn.maidaotech.java07.chapter02.zonghe;

import java.util.Arrays;

public class Sys {
    public static void main(String[] args) {
           String s="wics.bdi@cqn";
    String[] str = s.split("\\.");
    System.out.println(Arrays.toString(str));
    }
}
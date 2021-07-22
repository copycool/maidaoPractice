package cn.maidaotech.java07.set_practice;

import cn.maidaotech.java07.util.StringUtils;

public class AlphaSort {
    public static void main(String[] args) {
        String str = "The identifier of the encoding used to encode the bytes in value";
        {
            String res = StringUtils.sortAlpha(str, " ");
            System.out.println(res);
        }
    }
}
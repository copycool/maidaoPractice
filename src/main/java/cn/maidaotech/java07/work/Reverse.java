package cn.maidaotech.java07.work;

public class Reverse {
    public static void main(String[] args) {
        String rev = "abcdefg";
        String res = reverse(rev);
        System.out.println(res);
    }

    /**
     * 反转字符串
     * 
     * @param rev 源字符串
     * @return 反转后字符串
     */
    private static String reverse(String rev) {
        StringBuilder str = new StringBuilder(rev);
        String s = str.reverse().toString();
        return s;
    }
}
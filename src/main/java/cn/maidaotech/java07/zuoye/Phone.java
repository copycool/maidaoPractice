package cn.maidaotech.java07.zuoye;

public class Phone {
    public static void main(String[] args) {
        int[] phone = new int[] { 1, 3, 4, 5, 6, 2, 7, 8, 9, 0, 1 };
        // 如果为空
        if (phone == null || phone.length == 0) {
            System.out.println("不是手机号");
        } else
        // 若长度不是11位
        if (phone.length != 11) {
            System.out.println("不是手机号");
        } else // 若第一位不是1
        if (phone[0] != 1) {
            System.out.println("不是手机号");
        } else // 若第二位不是3,5,6,7,8,9,
        if (phone[1] == 0 || phone[1] == 1 || phone[1] == 2 || phone[1] == 4) {
            System.out.println("不是手机号");
        } else {
            System.out.println("是手机号");
        }
    }

}

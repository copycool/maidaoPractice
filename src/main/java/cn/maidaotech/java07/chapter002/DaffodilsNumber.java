package cn.maidaotech.java07.chapter002;

public class DaffodilsNumber {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (checkDaffodilsNumber(i)) {
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
    private static boolean checkDaffodilsNumber(int numeber){
        int ge = numeber % 10;
        int shi = numeber / 10 % 10;
        int bai = numeber / 100; 
        double flag = Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3);
        if (flag == numeber) {
            return true;
        }else{
            return false;
        }
        
    }
}

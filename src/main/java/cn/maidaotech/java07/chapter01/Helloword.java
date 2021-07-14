package cn.maidaotech.java07.chapter01;

public class Helloword {

    public static void main(String[] args) {
        String str = new String("迈道");
        str += "科技";
        
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        int Void = 1;
        System.out.println(str); 
        Helloword hw = new Helloword();
        System.out.println(hw.toString());
    }


    private static void method() {
        System.out.println("非static");
    }
}

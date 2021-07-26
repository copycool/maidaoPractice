package cn.maidaotech.java07.chapter02.comprehensivePractice;

public class Practice01 {
    //编写一个方法验证用户输入的手机号，要求：11位数字、只能以数字1开头，第二位可以是数字3、5、6、7、8、9。
    public static void main(String[] args) {
        if ( print("18738808218")) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
    public static boolean print(String n){
        
        if (n.length()!=11) {
            return false;
        }

        if (n.charAt(0) != '1') {
            return false;
        }

        
            if (n.charAt(1) != '3' && n.charAt(1) != '5' &&n.charAt(1) != '6' &&n.charAt(1) != '7' &&n.charAt(1) != '8' &&n.charAt(1) != '9' ) {
                return false;
            
            
        }
        return true;
    }
}
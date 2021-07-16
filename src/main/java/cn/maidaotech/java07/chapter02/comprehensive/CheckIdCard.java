package cn.maidaotech.java07.chapter02.comprehensive;

public class CheckIdCard {
    // 验证身份证号的合法性，身份证号必须满足以下规则
    // 必须以数字1至9开头
    // 出生年份只能是19**或20**年的数组
    // 出生月份只能是01至12月的数字
    // 出生日两位数字只能是01至31的数字
    //15到17位可以是任意数字
    // 第18位必须是是数字0-9和字母‘X’
    public static void main(String[] args) {
        System.out.println(check("412726200012x"));
        System.out.println(check("4127262000129998"));
        System.out.println(check("412726200012023456"));
        System.out.println(check("412726200012780"));
        System.out.println(check("0127262000128888"));
        System.out.println(check("412762000127777777777"));
    }
    public static boolean check(String idcard) {
        if (idcard == null || idcard.length() == 0) {
            return false;
        }
        if (idcard.length() != 18) {
            return false;
        }

        char[] c = idcard.toCharArray();
        for (int i = 0; i < 17; i++) {
            if (c[0] < '1' || c[0] > '9') {
                return false;
            }
        }

        if (c[0] == 0) {
            return false;
        }
        if (c[6] != '1' && c[7] != '9' || c[6] != '2' && c[7] != '0') {
            return false;
        }

        int m1 = c[10] - 48;
        int m2 = c[11] - 48;
        int m = m1*10 + m2;
        if (m<01||m>12) {
            return false;
        }

        int d1 = c[10] - 48;
        int d2 = c[11] - 48;
        int d = d1*10 + d2;
        if (d<01||d>31) {
            return false;
        }


        int[] w={7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int sum=0;
       // int current = Integer.parseInt(String.valueOf(charArray[i]));
         for(int i =0;i<17;i++){
            int current = Integer.parseInt(String.valueOf(c[i]));
            int count=current*w[i];
            sum+=count;  
         }
         int lastChar=Integer.parseInt(String.valueOf(c[17]));
         int countLastChar=sum%11;
         
         if(lastChar!=countLastChar){
           return false;
         }
        return true;

        
    }

}
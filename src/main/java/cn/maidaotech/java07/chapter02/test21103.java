package cn.maidaotech.java07.chapter02;

public class test21103 {
    // 必须以数字1至9开头
    // 出生年份只能是19**或20**年的数组 
    // 出生月份只能是01至12月的数字
    // 出生日两位数字只能是01至31的数字
    // 15到17位可以是任意数字
    // 第18位必须是是数字0-9和字母‘X’
    //4    1 0 3 0 4    2 0 0 0  0 1  2 6   1 0 4    8
    public static void main(String[] args) {
     
        
    }
    public static boolean checkIdNumber(String idNumber){
        if(idNumber==null||idNumber.length()==0){
            System.out.println("身份证不可以为空");
            return false;
        }
        if(idNumber.length()!=18){
            System.out.println("身份证必须是18位");
            return false;
        }

        char[] numbers=idNumber.toCharArray();
        int fistChar=numbers[0];
        if(fistChar<49||fistChar>57){
            System.out.println("必须以数字1至9开头");
            return false;
        }

        int year1=numbers[6];
        int year2=numbers[7];
        if(!((year1==1&&year2==9)||(year1==2&&year2==0))){
            System.out.println("出生年份只能是19**或20**年");
            return false;
        }

        int month1=numbers[10]-48;
        int month2=numbers[11]-48;
        int month=month2*10+month1;
        if(month<1||month>12){
            System.out.println("出生月份只能是01至12月的数字");
            return false;
        }

        int date1=numbers[12]-48;
        int date2=numbers[13]-48;
        int date=date2*10+date1;
        if(date<1||date>31){
            System.out.println("出生日两位数字只能是01至31的数字");
            return false;
        }

        int[] w={7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        int sum=0;
       // int current = Integer.parseInt(String.valueOf(charArray[i]));
         for(int i =0;i<17;i++){
            int current = Integer.parseInt(String.valueOf(numbers[i]));
            int count=current*w[i];
            sum+=count;  
         }
         int lastChar=Integer.parseInt(String.valueOf(numbers[17]));
         int countLastChar=sum%11;
         
         if(lastChar!=countLastChar){
             System.out.println("最后一位不对");
         }
        return true;
    }
}

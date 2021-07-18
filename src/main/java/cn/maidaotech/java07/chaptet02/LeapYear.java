package cn.maidaotech.java07;

public class LeapYear {
        
    private static LeapYear y;


    public void lyear(int year) {
        if(year<0){
            System.out.println("输入不合法");
        }
        
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println(year +"是闰年");
        }
        else{
            System.out.println(year+"不是闰年");
        }

    }

    public static void main(String[] args){
        LeapYear.y = new LeapYear();
        y.lyear(2021);
    }
    
}
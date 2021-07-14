package cn.maidaotech.java07.chapter02;

public class test2057 {
    //打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153
    public static void main(String[] args) {
 
        ShuiXianHua();
        
    }
    public static void ShuiXianHua(){
         for(int i=0;i<1000;i++){
            int num=i;
            int hun=num/100;
            int tens=num%100;
            int ten=tens/10;
            int unit=tens%10;
            if(i==unit*unit*unit+ten*ten*ten+hun*hun*hun){
                System.out.println(i+"");
            }
         }
    }
}

package cn.maidaotech.java07.chapter02;

public class test20810 {
    //输出9*9乘法口诀
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<10;i++){
            for(j=1;j<10;j++){
                System.out.print(i+"*"+j+"="+i*j+"    ");
            }
            System.out.println();
        }
    }
}

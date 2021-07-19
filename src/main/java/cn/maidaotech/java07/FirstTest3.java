package cn.maidaotech.java07;

public class FirstTest3 {
    public static void main(String[] args) {

     
        
        for (int i = 1; i <= 9; i++) {
            StringBuilder curLine = new StringBuilder();  
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || i == 9)
                    curLine.append(" * ");
                else if (j == 1 || j == 9)
                    curLine.append(" * ");
                else
                    curLine.append("   ");

            }
            System.out.println(curLine.toString());
        }
    }
}
    //  for(int i=1;i<=9;i++ ){
    //      for(int j =1;j<=i;j++){
    //          System.out.print(i + "*" + j +"="+ i * j +" ");
    //      }
    //      System.out.println();
    //  }

    

package cn.maidaotech.java07.work4.Test10;

public class Square {

    public static int cut(int l, int  w) {
     int temp;
     
     if(w>l){
         temp = l;
         l = w;
         w = temp;
     }
     if(l%w==0){
         return w;
     }
     else{
         temp=cut(w, l -w);
     }
     return temp;

    }
   public static void main(String[] args) {
       int l=168;
       int w=64;
       System.out.println("分割后的正方形边长："+cut(l,w));

   }
}

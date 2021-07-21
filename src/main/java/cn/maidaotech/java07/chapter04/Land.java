package cn.maidaotech.java07.chapter04;
// 有一块长 168 米宽 64 米的土地，将这块地分隔成大小相等的正方形
// 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现）
public class Land {
    public static void Split(){
        Landh(1,0);
    }
   
    public static void Landh(int x,int max){
        if(x>=64){
            System.out.println(max);
            return;
        }
        if(168%x==0 && 64%x==0)
            max = x;
           Landh(x+1,max);
        }
        public static void main(String[] args) {
            Split();
        }
        
    }
  

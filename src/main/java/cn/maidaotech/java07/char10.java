package cn.maidaitech.shui966;

public class char10 {
    public static void main(String[] args) {
        int i,j;
    for(i = 101 ; i <= 200 ; i++ )
    {
        for(j = 2 ; j < i ; j++)
        {
            if(i % j == 0)          //只要除到一个数让 i 能被整除就跳出该循环。
            {
                break;
            }
            else
            {
                if( j == i-1 )          //除完最后一个数后还不跳出循环，就可以判断该数为素数。
                {
                    System.out.println(i);
    }
}
    
}
}
}
}
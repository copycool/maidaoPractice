package com.example.demo;

public class Email {
   
    public int name;
    public int host;

    int[] numbers = new int[10];{
    for(int i = 48;i < 58;i ++){
        numbers[i] = i;
    }
    int[] numbers1 = new int[24];
    for(int n = 65;n < 91;n ++){
        numbers[n] = n;
    }
    int[] numbers2 = new int[24];
    for(int y = 97;y < 123;y ++){
        numbers[y] = y;
    }
    int[] numbers3 = {95};

    int[] numbers4 = (numbers.concat( numbers1, numbers2, numbers3);

    int[] numbers5 = ( numbers1.concat( numbers2);
    

    
}
}



/*验证邮箱是否符合规则：name@host，满足一下规则
name只能由字母、数字、下划线组成；
只能以字母开头至少包含大写字母、小写字母、数字、下划线中的三种
host中必须包含字符“.”，且“.”不能在host部分的两头
 95 48-57 65-90 97-122*/
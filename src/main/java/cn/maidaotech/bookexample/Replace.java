package cn.maidaotech.bookexample;

public class Replace {
    //字符串字串替换功能
    public static void main(String[] args) {
        String str = "I follow Bill Gate Tome Gate John Gate";
        str = str.replace("Gate","Gates");
        System.out.println(str);
        //这里是测试第一个替换  
        str = str.replaceFirst("Gates","Gate");
        System.out.println(str);  
    }
}
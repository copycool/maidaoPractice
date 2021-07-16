package cn.maidaotech.bookexample;

public class Replace {
    //字符串字串替换功能
    public static void main(String[] args) {
        String str = "I follow Bill GateGate Tome Gate John Gate 666666";
        str = str.replace("Gate","Gates");
        str = str.replace("666","9");
        str = str.replace("666666","29");
        System.out.println(str);
        //这里是测试第一个替换  
        // str = str.replaceFirst("Gates","Gate");
        // System.out.println(str);  
    }
}
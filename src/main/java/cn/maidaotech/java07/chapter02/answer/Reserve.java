package cn.maidaotech.java07.chapter02.answer;

public class Reserve {
    public static void main(String[] args) {
        // StringBuilder builder=new StringBuilder("I follow Bill Gate Tome Gate John Gate");
        // builder.replace(start, end, str)
        String str="I follow Bill Gate Tome Gate John Gate";
        String newstr=str.replace("Gate", "Gates");
        System.out.println(newstr);

        //替换第一个
        str=str.replaceFirst("Gate", "Gates");
        System.out.println(str);

        StringBuffer stringBuffer=new StringBuffer("asdf");
        stringBuffer.reverse();
        System.out.println(stringBuffer);


    }
}

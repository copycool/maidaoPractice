package cn.maidaotech.java07.zuoye;

/*从键盘输入学生学号，例如2019年01期12号，输入20190112，使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出 */

public class Stunumber {
    public static void main(String[] args) {
        Integer stunumber = 20190112;
        Integer year;
        Integer qishu;
        Integer xuhao;
        year = stunumber / 10000;
        qishu = stunumber % 2019 / 100;
        xuhao = stunumber % 2019 / 100;
        System.out.println("年份是" + year);
        System.out.println("期数是" + qishu);
        System.out.println("序号是" + xuhao);
    }

}

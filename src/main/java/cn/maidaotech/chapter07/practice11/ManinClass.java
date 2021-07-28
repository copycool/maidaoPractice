package cn.maidaotech.chapter07.practice11;

public class ManinClass {
    public static void main(String[] args) {
        Bank bank = new Bank();

        PersonA a = new PersonA(bank,"Counter");
        PersonB b = new PersonB(bank,"ATM");
        a.start();
        b.start();
    }
}
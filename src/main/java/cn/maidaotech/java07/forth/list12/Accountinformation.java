package cn.maidaotech.java07.forth.list12;

public class Accountinformation {
    public static void main(String[] args) {
        Password p = new Passwordtext();
        Account account = p.ById((int) (Math.random() * 100));
        System.out.println(
                "账号：" + account.getId() + ", 账户名称：" + account.getName() + ',' + ", 余额：" + account.getBalance());

    }
        
}

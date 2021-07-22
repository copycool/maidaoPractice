package cn.maidaotech.java07.unit4.Practice12;

public class AccountController {
    public static void main(String[] args) {
        AccountService service = new AccountServiceImpl();
        Account account = service.findById((int) (Math.random() * 100));
        System.out.println(
                "账号：" + account.getId() + ", 账户名称：" + account.getName() + ',' + " 余额：" + account.getBalance());

    }
}
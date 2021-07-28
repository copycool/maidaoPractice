package cn.maidaotech.java07.chapter07.practice11;

public class Bank {
    public static void counterRemmittance(Integer money, User user) {
        user.setBalance(user.getBalance() + money);
    }

    public static void counterRemmittance(Integer money, User user1, User user2) {
        if (user1.getBalance() < money) {
            System.out.println("余额不足，汇款失败");
            return;
        }
        user2.setBalance(user2.getBalance() + money);
        user1.setBalance(user1.getBalance() - money);

        StringBuffer buffer = new StringBuffer();
        buffer.append(user1.getUserName()).append(" 向 ").append(user2.getUserName()).append(" 汇款成功，")
                .append(user1.getUserName()).append("余额剩余 ").append(user1.getBalance()).append(" 元,")
                .append(user2.getUserName()).append("余额剩余 ").append(user2.getBalance()).append(" 元。");
        System.out.println(buffer.toString());
    }

    public static void AtmWithdrawMoney(Integer money, User user) {
        user.setBalance(user.getBalance() - money);

        StringBuffer buffer = new StringBuffer();
        buffer.append(user.getUserName()).append(" 取款成功，余额剩余 ").append(user.getBalance()).append(" 元。");
        System.out.println(buffer.toString());
    }
}
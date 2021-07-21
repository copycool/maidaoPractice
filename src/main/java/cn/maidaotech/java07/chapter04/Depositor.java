package cn.maidaotech.java07.chapter04;
// 编写一个程序，创建一个 HashMap 对象，

// 用于存储银行储户的信息（其中储户的主要信息有储 户的 ID、姓名和余额）。
// 另外，根据储户 ID 获取其余额信息。


public class Depositor {
    private long id;
    private String name;
    private double money;

    public Depositor() {

    }

    public Depositor(long id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;

    }

    // public static void main(String[] args) {
    // HashMap<Integer, String ,Integer> depositors = new HashMap<>();
    // depositors.put("yuqi",76767,99999);
    // }
    @Override
    public String toString() {
        
        return "Depositor[id="+ id +",name= "+ name + ",money= "+ money+"]";
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

  

}
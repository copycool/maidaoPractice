package cn.maidaotech.java07.work7.test10;

public class Ticket {
    private static int INIT_NO = 10000;
    private Integer id;
    // private Integer no;

    public Ticket() {
        id = INIT_NO++;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

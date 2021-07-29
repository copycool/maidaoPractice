package cn.maidaotech.java07.chapter07.Practice10_Self;

public class Ticket {
    private Integer id;
    
    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + "]";
    }

    public Ticket(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}

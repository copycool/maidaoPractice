package cn.maidaotech.java07.chapter07.mq;

public class PCData {
    private Integer num;

    public PCData(int num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "data:" + num;
    }
}
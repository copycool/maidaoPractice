package cn.maidaotech.java07.chapter03;

public class Number {
    private Integer x;
    private Integer y;

    public Number() {
    }

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer plus() {

        Integer result = this.x + this.y;
        return result;
    }

    public Integer minus() {

        Integer result = this.x - this.y;
        return result;
    }

    public Integer multiply() {

        Integer result = this.x * this.y;
        return result;
    }

    public Integer division() {

        Integer result = this.x / this.y;
        return result;
    }

    public static void main(String[] args) {
        Number n1 = new Number(1, 2);
        System.out.println("x+y=" + n1.plus());
        System.out.println("x-y=" + n1.minus());
        System.out.println("x*y=" + n1.multiply());
        System.out.println("x/y=" + n1.division());
    }
}

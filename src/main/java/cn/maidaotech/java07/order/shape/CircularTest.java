package cn.maidaotech.java07.order.shape;

import ch.qos.logback.core.net.SyslogOutputStream;

public class CircularTest {
    public static void main(String[] args) {
    Circular c = new Circular();
    c.setRadius(2.0);
    System.out.println(c.area());

}
}

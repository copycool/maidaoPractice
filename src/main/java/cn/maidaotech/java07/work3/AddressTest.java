package cn.maidaotech.java07.work3;

public class AddressTest {
    public static void main(String[] args) {
        Address[] address = new Address[3];
        address[0] = new Address("中国", "河南", "郑州", "华南城", "47366");
        address[1] = new Address("中国", "河南", "郑州", "沙窝里", "47366");
        address[2] = new Address("中国", "河南", "郑州", "龙湖", "47366");

        System.out.println(address[0].toString());

    }
}

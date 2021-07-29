package cn.maidaotech.java07.liaotian;


import java.io.IOException;
import java.net.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        DatagramSocket client = new DatagramSocket();
        while (flag){
            System.out.println("我说 "+ LocalDateTime.now() +" ：");
            Scanner scan = new Scanner(System.in);

            String sendStr =scan.nextLine();

            //判断是否退出程序
            if ("q".equals(sendStr)){
                flag = false;
                System.err.println("退出程序成功");
                break;
            }
            byte[] sendBuf = sendStr.getBytes();
            InetAddress address = InetAddress.getByName("192.168.55.64");
            int port = 6666;
            DatagramPacket sendPacket = new DatagramPacket(sendBuf,sendBuf.length,address,port);
            client.send(sendPacket);
            byte[] receiveBuf = new byte[100];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuf,receiveBuf.length);
            client.receive(receivePacket);
            String receiveStr = new String(receivePacket.getData(),0,receivePacket.getLength());



            System.out.println("服务端说：" + receiveStr);
        }
        client.close();

    }
}

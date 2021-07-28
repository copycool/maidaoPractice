package cn.maidaotech.java07.syncaddlock.chapter08.socket;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UDPServer {

    public static void main(String[] args) throws IOException {
        boolean flag = true;
        //创建服务端server
        DatagramSocket server =new DatagramSocket(6666);
        while (flag){
            byte[] receiveBuffer  = new byte[100];
            //创建接受数据包
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,receiveBuffer.length);
            server.receive(receivePacket);
            String receiveStr = new String(receivePacket.getData(),0,receivePacket.getLength());



            System.out.println("客户端说:" + receiveStr);
            int port = receivePacket.getPort();  //数据包，，客户端端口号
            InetAddress address = receivePacket.getAddress();  //数据包,,客户端地址

            System.out.println("我说 "+ LocalDateTime.now() +" ：");
            Scanner scan = new Scanner(System.in);
            String sendStr = scan.nextLine();
            //判断是否退出程序
            if (!StringUtils.isEmpty(sendStr) && "q".equals(sendStr)){
                flag = false;
                System.err.println("退出程序成功");
                break;
            }
            byte[] sendBuffer = sendStr.getBytes();

            //创建发送到客户端的数据包
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer,sendBuffer.length,address,port);
            server.send(sendPacket);
        }
        server.close();
    }
}

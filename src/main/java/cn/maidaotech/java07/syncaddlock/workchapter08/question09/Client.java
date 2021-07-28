package cn.maidaotech.java07.syncaddlock.workchapter08.question09;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread {

    private String ip;
    private int port;

    public Client(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            System.out.println("连接到主机：" + ip + "端口号：" + port);
            //连接到服务端，并发送数据
            Socket client = new Socket(ip,port);
            //发送消息到服务端
            PrintWriter pw = new PrintWriter(client.getOutputStream());
            BufferedWriter bw = new BufferedWriter(pw);
            bw.write("我是客户端：" + client.getLocalSocketAddress());
            bw.flush();
            //输出：获取到的服务端的数据
            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("服务端：" + in.readUTF());
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Client client  = new Client("127.0.0.1",6666);
            client.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package cn.maidaotech.java07.syncaddlock.chapter08.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {

    private String ip;
    private int port;

    public Client(String ip,int port){
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            System.out.println("连接到主机：" + ip + "端口号：" + port);
            Socket client = new Socket(ip,port);
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("我是客户端：收到请回复"+nextLine);

            PrintWriter pw = new PrintWriter(client.getOutputStream());
//            pw.write("我是客户端：收到请回复"+nextLine);
//            pw.flush();

            DataInputStream in = new DataInputStream(client.getInputStream());
            System.out.println("服务端：" + in.readUTF());

//            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//            System.out.println("服务端：" + br.readLine());
//
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

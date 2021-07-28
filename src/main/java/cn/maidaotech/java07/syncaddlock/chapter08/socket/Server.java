package cn.maidaotech.java07.syncaddlock.chapter08.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort());
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                DataInputStream in = new DataInputStream(inputStream);
                System.out.println("客户端，" + in.readUTF());

                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF("您的消息已收到");
//
//                PrintWriter pw = new PrintWriter(socket.getOutputStream());
//                pw.println("您的消息已收到");

                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Server server = new Server(6666);
            server.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
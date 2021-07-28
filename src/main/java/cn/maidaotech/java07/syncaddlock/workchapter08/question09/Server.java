package cn.maidaotech.java07.syncaddlock.workchapter08.question09;

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
                //监听端口号
                Socket socket = serverSocket.accept();
                //获取客户端传来的数据
                InputStream inputStream = socket.getInputStream();
                DataInputStream in = new DataInputStream(inputStream);
                System.out.println("客户端：" + in.readUTF());

                //输出数据到客户端
                PrintWriter pw = new PrintWriter(socket.getOutputStream());

                pw.write("您的消息已收到");
                pw.flush();
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
                break;
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
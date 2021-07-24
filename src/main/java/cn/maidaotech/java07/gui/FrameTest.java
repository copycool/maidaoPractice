package cn.maidaotech.java07.gui;
import java.awt.*;

public class FrameTest {
    public FrameTest(String string) {
	}

	//第一个gui界面
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个java图形界面窗口");

        //设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400, 400);

        //设置背景颜色
        frame.setBackground(Color.BLACK);

        //设置窗口大小固定
        frame.setResizable(false);

        //弹出的初始位置
        frame.setLocation(200, 200);

    }
    
}
package cn.maidaotech.java07.gui;
import java.awt.*;
import java.util.Set;

public class FrameTest02 {
    //展示多个窗口
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame(200, 200, 200, 200, Color.BLACK);
    }
}
class MyFrame extends Frame{
    static int id = 0;//可能存在多个窗口，需要一个计数器

    //为MyFrame写个构造器
    public MyFrame(int x,int y,int w,int h,Color color){
        super("Myframe+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);

    }

    
}
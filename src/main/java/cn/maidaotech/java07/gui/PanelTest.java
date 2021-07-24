package cn.maidaotech.java07.gui;

import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;

public class PanelTest {
    //panel  可以看成是一个空间，但是不能单独存在
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel =new Panel();

        //设置布局
        frame.setLayout(null);

        //设置颜色和坐标
        frame.setBackground(Color.PINK);
        //frame.setBackground(new Color(1,2,2));
        frame.setBounds(300, 300, 500, 500);

        //panel 设置坐标，相对于frame
        panel.setBackground(Color.RED);
        panel.setBounds(50, 50, 400, 400);

        //将面板放入窗口里
        frame.add(panel);
        frame.setVisible(true);
        
        //监听事件
        // frame.addWindowListener (new WindowAdapter(){
        //     @Override
        //     public void windowClossing(windowEvent e){
        //         System.exit(0);
        //     }
        // });
       

    }
    
}
package cn.maidaotech.java07.ch07.practice10;

import java.util.ArrayList;
import java.util.List;

// 三个窗口同时出售 100 张票：
// a. 票抽象为类，拥有票号等属性
// b. 站台抽象为线程类 
// c. 同一张票不能重复销售
public class Station implements Runnable {
    private List<Window> windows = new ArrayList<>();

    @Override
    public void run() {
        
        windows.forEach(windows -> new Thread(windows).start());

    }

    public Station( List<Window> windows ){
        this.windows = windows;

    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }
    
}
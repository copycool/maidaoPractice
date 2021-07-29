package cn.maidaotech.java07.chapter07.practice10;

import java.util.ArrayList;
import java.util.List;

public class Station implements Runnable {
    private List<Window> windows = new ArrayList<>();

    @Override
    public void run() {
        windows.forEach(window -> new Thread(window).start());
    }

    public Station(List<Window> windows) {
        this.windows = windows;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }
}
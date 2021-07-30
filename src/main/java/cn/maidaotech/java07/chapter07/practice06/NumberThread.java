package cn.maidaotech.java07.chapter07.practice06;

public class NumberThread extends Thread {
    private Data data;

    public NumberThread(Data data) {
        super();
        this.data = data;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000; j++) {
            data.setI(data.getI() + 1);
        }
    }
}

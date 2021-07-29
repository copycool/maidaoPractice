package cn.maidaotech.java07.ch07.practice10;

import java.util.ArrayList;
import java.util.List;

public class TicketTest {
    private static List<Ticket> tickets = new ArrayList<>();
    private static List<Window> windows = new ArrayList<>();

    public static void main(String[] args) {
     
        Thread thread = new Thread(new Station(windows));
        thread.start();
        tickethelp();
        Windowhelp();
    }
static void tickethelp(){
    for(int i = 1;i<10;i++){
        tickets.add(new Ticket(i));
    }
}
static void Windowhelp() {
    for (int i = 1; i < 4; i++) {
        windows.add(new Window("窗口" + i, tickets));
    }
}
    
}
package cn.maidaotech.java07.ch07.practice10;


import java.util.List;

public class Window implements Runnable {
    private String WindowName;
    private List<Ticket> tickets;

    public Window(){

    }
    public Window(String WindowName, List<Ticket> tickets){
        this.WindowName = WindowName;
        this.tickets = tickets;

    }

    @Override
    public void run() {
        while(tickets.size()>0)
        {
           this.sellTicket();
        }
        
    }

    public  void sellTicket(){
        Ticket ticket;
         
            synchronized(tickets){
               if(tickets.size()<=0){
              System.out.println("票已售完");
              return;
               }
              ticket = this.tickets.remove(tickets.size() - 1);
            System.out.println(this.WindowName+"出售了1张票");
            try {
               Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
            }
            
        
    }

    public String getWindowName() {
        return WindowName;
    }

    public void setWindowName(String windowName) {
        WindowName = windowName;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
    

}
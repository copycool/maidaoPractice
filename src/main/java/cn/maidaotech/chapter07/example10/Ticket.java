package cn.maidaotech.chapter07.example10;

public class Ticket {
private String name;

public Ticket(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return  name ;
}


}
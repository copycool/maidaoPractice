package cn.maidaotech.java07.chapter07.instance.rabbitandturtle;

public class race {
        public static void main(String[] args) {
        RabbitAndTurtle rabbit = new RabbitAndTurtle("小白兔子");
        RabbitAndTurtle turtle = new RabbitAndTurtle("乌龟");
        rabbit.start();
        turtle.start();
    }
}

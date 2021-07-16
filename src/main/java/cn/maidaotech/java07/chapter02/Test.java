package cn.maidaotech.java07.chapter02;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("萨摩耶");
        dog.setBark("汪汪汪~~~");
        // Animal book;
        Cat cat = new Cat();
        cat.setBook("book");
        System.out.println(cat.getBook());
    }
}
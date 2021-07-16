package cn.maidaotech.java07.chaptet03;

public class DogTest {
    public static void main(String[] args) {

        Dog d1 = new Dog("lili", "黑色", 18);
        d1.setName("wiwi");
        System.out.println(d1.toString());

    }

    @Override
    public String toString() {
        return "DogTest []";
    }


  

}
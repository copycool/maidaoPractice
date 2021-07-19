package cn.maidaotech.java07.chapter04;

public class Hanoi {
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.hanoi(10, 'A', 'B', 'C');
    }

    public void hanoi(int n, char origin, char assist, char destination) {
        if (n == 1) {
            move(origin, destination);
        } else {
            hanoi(n - 1, origin, destination, assist);
            move(origin, destination);
            hanoi(n - 1, assist, origin, destination);
        }
    }

    private void move(char origin, char destination) {
        System.out.println("Direction:" + origin + "--->" + destination);
    }
}

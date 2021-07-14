package cn.maidaotech.java07.chapter02.practice.test205;

public class Daffodil {

    public static void println() {
        for (int i = 100; i <= 999; i++) {
            int hundredsPlace = i / 100;
            int tensPlace = i / 10 % 10;
            int onesPlace = i % 10;
            Boolean result = (hundredsPlace * hundredsPlace * hundredsPlace + tensPlace * tensPlace * tensPlace
                    + onesPlace * onesPlace * onesPlace) == i;
            if (result)
                System.out.println(i);
        }
    }

}
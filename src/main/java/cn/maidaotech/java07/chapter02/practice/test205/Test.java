package cn.maidaotech.java07.chapter02.practice.test205;

public class Test {
    static class SnoTest {
        public static void main(String[] args) {
            SnoValid.valid(20192019);
            SnoValid.valid(20202119);
            SnoValid.valid(20192009);

        }
    }

    static class LeepYearTest {
        public static void main(String[] args) {
            System.out.println(LeepYear.valid(1900));
            System.out.println(LeepYear.valid(2000));
            System.out.println(LeepYear.valid(2040));
        }
    }

    static class DaffodilTest {
        public static void main(String[] args) {
            Daffodil.println();
        }
    }
}
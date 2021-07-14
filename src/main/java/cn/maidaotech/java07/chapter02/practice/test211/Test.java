package cn.maidaotech.java07.chapter02.practice.test211;

public class Test {
    /**
     * 手機號測試
     */
    static class phoneTest {
        public static void main(String[] args) {
            System.out.println(PhoneNumValid.valid("")); // false
            System.out.println(PhoneNumValid.valid(null)); // false
            System.out.println(PhoneNumValid.valid("25517509252")); // false
            System.out.println(PhoneNumValid.valid("16517509252")); // false
            System.out.println(PhoneNumValid.valid("15517509252")); // true
        }
    }

    static class EmailTest {
        public static void main(String[] args) {
            System.out.println(EmailValid.valid("e1-mail@xx.x")); // 1. false
            System.out.println(EmailValid.valid("1e1_mail@xx.x")); // 2. false
            System.out.println(EmailValid.valid("e1mail@xx.x")); // 3. false
            System.out.println(EmailValid.valid("e1_mail@xxx.")); // 4. false
            System.out.println(EmailValid.valid("e1_mail@xxx")); // 5.false
            System.out.println(EmailValid.valid("e1_mail@xx.x")); // 6.true
        }
    }

    static class IdTest {
        public static void main(String[] args) {
            System.out.println(IdValid.valid("411327199812060311"));
        }
    }

    static class EasySudokuTest {
        public static void main(String[] args) {
            int[] testArr = { 0, 0, 4, 6, 0, 2, 0, 0, 0 };
            EasySudoku.play(testArr);
        }
    }
}
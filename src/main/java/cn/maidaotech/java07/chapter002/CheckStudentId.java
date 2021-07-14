package cn.maidaotech.java07.chapter002;

public class CheckStudentId {
    public static void main(String[] args) {
        System.out.println(""+getYear(20190112));
        System.out.println(""+getIssue(20190112));
        System.out.println(""+getNumber(20190112));

    }
    private static Integer getYear(Integer Id){
        Integer year;
        year = Id / 10000;
        return year;
    }
    private static Integer getIssue(Integer Id){
        Integer issue;
        issue = Id % 10000 / 100;
        return issue;
    }
    private static Integer getNumber(Integer Id){
        Integer number = Id % 100;
        return number;
    }
}

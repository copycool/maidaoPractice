package cn.maidaotech.java07.zuoye;

/*编程检测用户名的合法性，用户名需满足以下条件：长度8到20个字符,只能英文字母、数字,必须以大写字母开头*/
public class CheckUsername {

    public static void main(String[] args) {
        String name = "ynamenhasai12baj";
        char Name[] = name.toCharArray();
        int firstChar = (int) Name[0];

        if (Name == null) {
            System.out.println("名字不符合规则");
        }else
        if (Name.length < 8 || Name.length > 20) {
            System.out.println("名字不符合规则");
        }

        if ((firstChar >= 65 && firstChar <= 90)) {

        }
        for (int i = 1; i < Name.length; i++) {
            int a = Name[i];
            if (!((a >= 48 && a <= 57) || (a >= 65 && a <= 90) || (a >= 97 && a <= 122))) {
                i++;
            }
            System.out.println("名字符合规则");
        }

    }

}

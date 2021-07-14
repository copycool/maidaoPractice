package cn.maidaotech.java07.chapter02;

public class test21102 {
      //验证邮箱是否符合规则：name@host，满足一下规则：
    // name只能由字母、数字、下划线组成；
    // 只能以字母开头 至少包含大写字母、小写字母、数字、下划线中的三种
    // host中必须包含字符“.”，
    // 且“.”不能在host部分的两头
    public static void main(String[] args) {
        checkEmile("");
        checkEmile("123456");
        checkEmile("123@456");
        checkEmile("a123@123");
        checkEmile("a12A3@A4");
        checkEmile("b12_3@123");
        checkEmile("b12A_@123");
        checkEmile("b12A@aa.com");

        
     }
    public static boolean checkEmile(String userEmail){
        if(userEmail==null||userEmail.length()==0){
            System.out.println("邮箱不可为空");
            return false;
        }
        // char[] email=userEmail.toCharArray();
        if(!userEmail.contains("@")){
            System.out.println("邮箱不含@");
            return false;
        }

        String[] emails=userEmail.split("\\@");
        String nameString=emails[0];
        String hostString=emails[1]; 
        char[] name=nameString.toCharArray();
        int fistChar=name[0];
        if(!((fistChar>=65&&fistChar<=90)||(fistChar>=97&&fistChar<=122))){
            System.out.println("必须以字母开头");
            return false;
        }


        int[] flags=new int[4];
        int sum=0;
        // int upperCase=0;
        // int lowerCase=0;
        // int number=0;
        // int underLine=0;

        for(int i=0;i<name.length;i++){
            if(name[i]>=65&&name[i]<=90){
                flags[0]=1;
            }
            if(name[i]>=97&&name[i]<=122){
                flags[1]=1;
            }
            if(name[i]>=49&&name[i]<=57){
                flags[2]=1;
            }
            if(name[i]==95){
                flags[3]=1;
            }
        }
        for(int k = 0 ;k<4;k++){
            if(flags[k]==1){
                sum++;
            }
        }
        if(sum<3){
            System.out.println(" 至少包含大写字母、小写字母、数字、下划线中的三种");
            return false;
        }
        
      

        if(!hostString.contains(".")){
            System.out.println("邮箱必须含有‘.’");
            return false;
        }
        String[] hosts=hostString.split("\\.");
        if(hosts[0]==null||hosts[0].equals("")){
            System.out.println("host的前半部分不可以为空");
            return false;
        }
        if(hosts[1]==null||hosts[1].equals("")){
            System.out.println("host的后半部分不可以为空");
            return false;
        }
       System.out.println("邮箱格式正确");
        return true;
    }
}

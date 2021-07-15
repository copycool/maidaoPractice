package cn.maidaotech.java07;
/*
验证邮箱是否符合规则：name@host，满足一下规则：
name只能由字母、数字、下划线组成；
只能以字母开头;
至少包含大写字母、小写字母、数字、下划线中的三种.
host中必须包含字符“.”，且“.”不能在host部分的两头

*/
public class EmailTest {
    public static void main(String[] args) {
        System.out.println(check("Like2020@maidaotech.cn"));
        System.out.println(check("Li_ke@maidaotech.cn"));
        System.out.println(check("like2020@maidaotech.cn"));
        System.out.println(check("like@maidaotech.cn"));
        System.out.println(check("123fff@qq.com"));


    }
    

    public static boolean check(String email){

        if(email == null || email.indexOf("@") == -1){
            return false;
        }
        String[] parts= email.split("@");//分成@前后两部分数组,前半部分parts[0]、后半部分parts[1]
        int index = 0;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasUnderlin = false;
        while(index <parts[0].length() ){
            char c = parts[0].charAt(index);
            if(index == 0 && !StringUtils.isAlpha(c)){
                return false;
            }
            if(!isAlphaOrNumber(c) && c != 95){
                return false;
            }
            if(StringUtils.isLowerCase(c)){
                hasLower= true;
            }
            if(StringUtils.isUpperCase(c)){
                hasUpper=true;
            }
            if(StringUtils.isNumber(c)){
                hasNumber = true;
            }
            if(c == 95){
                hasUnderlin = true;
            }
            index++;
        }
        int types = 0;
        if(hasLower){
            types++;
        }
        if(hasUpper){
            types++;
        }
        if(hasUnderlin){
            types++;
        }
        if(hasNumber){
            types++;
        }
        if(types<3){
            return false;
        }

        int dotIndex = parts[1].indexOf(".");
        if(dotIndex<=0 || dotIndex == parts[1].length()-1){
            return false;
        }
        return true;
        
  
    }
    private  static boolean isAlphaOrNumber(char c){
        if(StringUtils.isAlpha(c) || StringUtils.isNumber(c)){
            return true;
        }
        return false;
    }




}
    
    

package cn.maidaitech.shui966.Char3;
//三
//编写一个代表地址的Address类，地址信息由国家，省份，城市，街道，邮编组成
//并可以调用方法返回完整的地址信息。
public class adress {
    private String state;
    private String province;
    private String city;
    private String street;
    private Integer postcode;
    public adress(){

    }
    public adress(String state,String province,String city,String street,Integer postcode){
        this.state=state;
        this.province=province;
        this.city=city;
        this.street=street;
        this.postcode=postcode;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getProvince() {
        return province;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet() {
        return street;
    }
    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }
    public int getPostcode() {
        return postcode;
    }
    
    public void print(){
        System.out.println("国家："+state+" 省份："+province+" 城市: "+city+" 街道: "+street+" 邮编: "+postcode);
    }

    public static void main(String[] args) {
        adress resident=new adress();
        adress resident1=new adress("中国","郑州","新郑","龙湖镇",410220);
        resident.print();
        resident1.print();
    }
}
package cn.maidaotech.java07.order.address;
// 编写一个代表地址的 Address 类，地址信息由国家，省份，城市，街道，邮编组成，并可以调 用方法返回完整的地址信息。
public class Address {
    String country;
    String province;
    String city;
    String street;
    @Override
    public String toString() {
          return "Address [city=" + city + ", coutry=" + country + ",   province=" + province
                     + ", street=" + street + "]";
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this. country = country;
    }
    public String getPronvice(){
        return country;
    }
    public void setProvince(String province){
        this. province = province  ;
    }
    public String getCity(){
            return city;
    }
    public void setCity(String city){
            this. city = city ;
    }
    public String getStreet(){
            return street;
    }
    public void setStreet(String street){
                this. street = street ;
    }
}

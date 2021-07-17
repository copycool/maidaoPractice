package cn.maidaotech.java07.chapter03;
// 编写一个代表地址的 Address 类，
// 地址信息由国家，省份，城市，街道，邮编组成，
// 并可以调 用方法返回完整的地址信息。
public class GetAddress {
    public static void main(String[] args) {
        
    Address ads = new GetAddress().new Address("中国","河南","郑州","华南城","88888888@maidao.cn");
    System.out.println(ads.toString());
    }
    class Address{
        String country;
        String province;
        String city;
        String street;
        String email;

        @Override
        public String toString() {
            return "Addredd [country=" + country + ", province=" + province + ",city=" + city +", street=" + street + ",  email=" + email
                    +  "]";
        }

		public Address(String country, String province, String city, String street, String email) {
			this.country = country;
			this.province = province;
			this.city = city;
			this.street = street;
			this.email = email;
		}
        
    }
}
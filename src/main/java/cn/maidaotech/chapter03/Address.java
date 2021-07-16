package cn.maidaotech.chapter03;

public class Address {
    private String country;
    private String province;
    private String city;
    private String block;
    private Integer postNumber;
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setCountry("漂亮国");
        address1.setProvince("add州");
        address1.setCity("洛杉矶");
        address1.setBlock("唐人街");
        address1.setPostNumber(123);
        System.out.println(address1.getCountry());
        System.out.println(address1.getProvince());
        System.out.println(address1.getCity());
        System.out.println(address1.getBlock());
        System.out.println(address1.getPostNumber());
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(Integer postNumber) {
        this.postNumber = postNumber;
    }
    
}
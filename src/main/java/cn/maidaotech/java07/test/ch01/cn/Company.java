package cn.maidaotech.java07.test.ch01.cn;

public class Company {
    private String name;
    protected String faxNo;
    private String address;

    public Company(String companyName){
        name =companyName;
    }
    public void setAddress(String companyAddress) {
        address=companyAddress;
        
    }
    public String getAddress() {
        return address;
        
    }
    public static void main(String[] args) {
        Company company=new Company("河南迈道信息技术有限公司");
        company.setAddress("龙湖镇");
        System.out.println("公司名："+company.name);
        System.out.println("地址："+company.getAddress());
    }
    }

package cn.maidaotech.java07;

public class Person {
    private String name;
    private String address;
    private String sex;
    private int age;

	public Person(String name, String address, String sex, int age) {
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static String message(String name,String address,String sex,int age, int i, int j){
        if (name!=""&& address!="" && sex!=""&& age!=0) {
            return "信息输出"+name+">>>"+address+">>>"+sex+">>>"+age;
        }
        return "输入信息错误，请再次调用输入！";
    
    }

	public void message() {
	}
}
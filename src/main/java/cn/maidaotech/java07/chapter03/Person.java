package cn.maidaotech.java07.chapter03;


public class Person {
    private String name;
    private String address;
    private Byte sex;
    private Integer age;

    public Person(){
        
    }

	public Person(String name, String address, Byte sex, Integer age) {
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.age = age;
	}
    public String message(){
        return new StringBuilder(this.name).append("  ").append(this.sex).append("  ").append(this.age).append("\n").append(this.address).toString();

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

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    


}

    
    
    
    

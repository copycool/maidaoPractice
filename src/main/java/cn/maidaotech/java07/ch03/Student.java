package cn.maidaotech.java07.ch03;

    public class Student extends Person{
        private Integer mathScort;
        private Integer enScort;
        public  Student() {
            
        }
        
        public Student (String name,String address,String sex,String age,Integer mathScort,Integer enScort){
            super(name,address,sex,age);
            this.mathScort=mathScort;
            this.enScort=enScort;
        }
        public Integer getMathScort() {
            return mathScort;
        }
        public  void setMathScort(Integer mathScort) {
            this.mathScort=mathScort;
        }
        public Integer getEnScort() {
            return enScort;
        }
        public void setEnScort(Integer enScort) {
            this.enScort=enScort;
        }
    
    
    public String message() {
        return "Student [name=" +getName()+ ", address=" +getAddress()+ ",sex=" +getSex()+ ",age=" +getAge()+ ",enScort=" + enScort + ", mathScort=" + mathScort + "]";
    }

 
    }

    

   


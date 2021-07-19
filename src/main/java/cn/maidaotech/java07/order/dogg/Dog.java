package cn.maidaotech.java07.order.dogg;
//设计一个 Dog 类，有名字，颜色，年龄等属性，定义构造方法来初始化类的这些属性， 
//定义 一个方法输出 Dog 信息。编写测试类，创建一个 Dog 类型的数组，遍历数组输出元素信息。
public class Dog{
        String name;
        String coloer;
        String age;
        public Dog(){

        }
        public Dog(String name, String color, String age) {
            this.name = name;
            this.coloer = color;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Dog [age=" + age + ", coloer=" + coloer + ", name=" + name + "]";
        }
    
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getAge(){
            return age;
        }
        public void setAge(String age){
            this.age=age;
        }
        public String getColoer(){
            return coloer;
        }
        public void setColoer(String coloer){
            this.coloer=coloer;
        }
      
        public String dogOut(){
              
            String[] dog = new String[]{name,coloer,age};
            StringBuilder builder = new StringBuilder();
            for(int i = 0;i < dog.length;i++){
                builder.append(dog[i]);
        }
            return builder.toString();
        }         
    }
 
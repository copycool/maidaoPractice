package cn.maidaotech.java07.unit3;

        public class Dog{
            private String name;
            private String color;
            private String age;

            public Dog(String name, String color, String age) {
                this.name = name;
                this.color = color;
                this.age = age;   
            }
            public Dog() {
            }
            
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

           
            
        }



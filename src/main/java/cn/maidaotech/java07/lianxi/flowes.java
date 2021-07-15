package cn.maidaotech.java07.lianxi;

public class flowes {
    
    
        private int num;
        class WaterFlowers{//内部类(内部类可直接访问外部类的私有域)
            public void FlowersNum(){
                for(int num=100;num<1000;num++){
                    int a=num/100;
                    int b=num/10%10;
                    int c=num%10;
                    if(num==a*a*a+b*b*b+c*c*c){
                        System.out.println("水仙花数为："+num);
                    }
                }
            }
        }
    }
    


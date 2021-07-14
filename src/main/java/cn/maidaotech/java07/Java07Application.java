package cn.maidaotech.java07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Java07Application {

	public static void main(String[] args) {
		//System.out.println(test());
	/** 	SpringApplication.run(Java07Application.class, args);
		String a = "happy";
		String sub = a.substring(0,4);
		System.out.println(sub);
     **/
       //String name = "王银胜";
	 // System.out.println("HELLO".equalsIgnoreCase("hello") );
	//  System.out.println("你好".equals("hello") );
	/**StringBuilder builder = new StringBuilder();
	builder.append("迈道").append("科技");
System.out.println(builder);
	}
	public static boolean test(){
		return false;
	**/
	int x=2;      
	  switch (x){           
		   case 1:   System.out.println("1");      
	       case 2:   System.out.println("2"); 
			         break;         
		   case 3:   System.out.println("3");         
	       default:   System.out.println("default");  }
	}
}
/**Person p1 = new Person();
p1.name = "wang";
p1.isMale = true;
System.out.println(p1.name);
p1.eat();
p1.listen();
p1.talk("Chinese");
}
}

class Person{
String name;
int age = 1;
boolean isMale;
public void eat(){
System.out.println("人可以进食");
}
public void listen() {
System.out.println("人可以听音乐") ;
}
public void talk(String yuyan) {
System.out.println("人可以说话" + yuyan);
}
}
**/

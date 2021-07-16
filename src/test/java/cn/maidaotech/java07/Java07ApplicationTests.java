package cn.maidaotech.java07;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import cn.maidaotech.java07.chapter03.practice.Dog;

@SpringBootTest
class Java07ApplicationTests {

	@Test
	void contextLoads() {
		Dog[] dogList = new Dog[11];
		for (int i = 0; i <= 10; i++) {
			dogList[i] = new Dog("dog"+i,"red"+i,i);
		}
		for(Dog dog : dogList){
			System.out.println(dog.toString());
		}
	}

}

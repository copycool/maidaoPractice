package cn.maidaotech.java07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.maidaotech.java07.dawn.HelloWorld;

@SpringBootApplication
public class Java07Application {

	public static void main(String[] args) {
		SpringApplication.run(Java07Application.class, args);
		HelloWorld.seyHi();
	}

}

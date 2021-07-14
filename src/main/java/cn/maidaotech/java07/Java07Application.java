package cn.maidaotech.java07;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Java07Application {

	public static void main(String[] args) {
		SpringApplication.run(Java07Application.class, args);
		Calendar calendar= Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

}

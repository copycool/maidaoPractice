package cn.maidaotech.java07.chapter03.practice;

import org.junit.jupiter.api.Test;

public class StudentTest {
	@Test
	void testMessage() {
        Student student = new Student("peas", "china", "man", 22, 100, 100);
        System.out.println(student.message());
	}
}

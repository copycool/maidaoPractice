package cn.maidaotech.java07.chapter03.practice;

import org.junit.jupiter.api.Test;

public class NumberTest {
    
	@Test
	void testDivision() {
        Number number = new Number(2, 1);
        System.out.println(number.division(1,2,3,4,5,6,7));
	}

	@Test
	void testMinus() {
        Number number = new Number(2, 1);
        System.out.println(number.minus());
	}

	@Test
	void testMultiply() {
        Number number = new Number(2, 1);
        System.out.println(number.multiply());
	}

	@Test
	void testPlus() {
        Number number = new Number(2, 1);
        System.out.println(number.plus());
	}
}

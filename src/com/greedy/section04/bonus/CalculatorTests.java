package com.greedy.section04.bonus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	private Calculator calc;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll 동작함...");
	}
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
		System.out.println("beforeEach 동작함...");
	}
	
	public CalculatorTests() {
		calc = new Calculator();
		System.out.println("생성자 호출..");
	}
	@Test
	@DisplayName("sumTwoNumber에 10과 20을 전달하여 잘 더해지는지 확인")
	public void testSumTwoNumber() {
		
//		int result = calc.sumTwoNumber(10, 20);
//		
//		System.out.println("테스트1");
//		
//		assertEquals(30, result, 1);
		
		//given
		int num1 = 10;
		int num2 = 20;
		int expected = 30;
		
		//when
		int result = calc.sumTwoNumber(num1, num2);
		
		//then
		assertEquals(30, result);
	}
	
	@Test
	@Disabled
	public void testSumTwoNumber2() {
		
		int result = calc.sumTwoNumber(30, 50);
		
		System.out.println("테스트2");
		
		assertEquals(81, result, 1);
//		assertTrue
//		assertNotNull
//		assertNull
	}
	
	@AfterEach
	public void close() {
		System.out.println("afterEach 동작함...");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll 동작함...");
	}
}

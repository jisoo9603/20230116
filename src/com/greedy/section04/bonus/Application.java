package com.greedy.section04.bonus;

public class Application {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int result = calc.sumTwoNumber(10, 20);
		if(result == 30) {
			System.out.println("테스트 성공");
		} else {
			System.out.println("테스트 실패");
		}
		
		int result2 = calc.sumTwoNumber(20, 30);
		if(result2 == 50) {
			System.out.println("테스트 성공");
		} else {
			System.out.println("테스트 실패");
		}
		
	}

}

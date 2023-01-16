package com.greedy.section01.extend;

public class Car {

	private boolean isRunning;
	
	public Car() {
		System.out.println("Car 클래스의 기본 생성자 호출됨...");
	}
	
	public void run() {
		isRunning = true;
		System.out.println("자동차가 달립니다.");
	}
	
	public void soundHorn() {
		
		/* super.
		 * 부모 인스턴스의 주소를 저장하는 레퍼런스 변수이다
		 * this.은 자동으로 컴파일러가 추가해주지만 명시적으로 부모가 가진 멤버에 접근해야 하는경우 super을 명시해야 한다.
		 *  */
		if(isRunning) {
			System.out.println("빵!빵!");
		} else { 
			System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
		}
		
	}
	
	public void stop() {
		isRunning = false;
		System.out.println("자동차가 멈춥니다.");
	}
	
	protected boolean isRunning() {
		return isRunning;
	}
}

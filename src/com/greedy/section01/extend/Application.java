package com.greedy.section01.extend;

public class Application {

	public static void main(String[] args) {
		
		/* 상속(inheritance)
		 * 부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자신이 물려받는다는 의미이다.
		 * 클래스 또한 부모클래스와 자식클래스로 역할을 나누어서 부모가 가지는 멤버를 자식이 물려받아
		 * 자기 멤버인 것 처럼 사용할 수 있도록 만든 기술이다.
		 * 
		 * 자바에서의 상속은 부모클래스의 확장(extends)의 개념을 가진다.
		 * 물려받아서 자신의 것 처럼 사용하는 것 뿐 아니라 추가적인 멤버도 작성이 가능해진다.
		 * 특히 메소드 재정의(overriding)라는 기술을 이용해서 부모가 가지고 있는 메소드를 재정의하는 것도 가능하다.
		 * 
		 * 메소드 재정의(overriding)이란 부모가 가지는 메소드 선언부를 그대로 사용하면서
		 * 자식 클래스가 정의한 메소드대로 동작하도록 구현 몸체 부분을 새롭게 작성하는 기술이다.
		 * 메소드 재정의를 하면 메소드를 후출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
		 * */
		
		/* 객체지향 설계 관점에서의 상속
		 * 모든 객체는 자신이 수신한 메세지에 대해 응답을 해야 하는 책임을 가지며, 그 책임의 규모는 적절해야 한다.
		 * 적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응답)을  통해 프로그램이 동작하는것이 객체지향 프로그래밍이다.
		 * 
		 * 이 때 객체는 그 객체만이 수행할 수 있는 기능을 설계하기보다 역할의 관점으로 바라봐야 한다.
		 * 역할이란 동일한 동작을 수행하는 것을 정의한것이며, 대체 가능성을 의미한다.
		 *  
		 * 즉, 부모 클래스를 추상화 하는 경우 역할의 관점으로 바라봐야 한다.
		 * 그래야 자식클래스로 생성한 객체들이 서로 역할을 수행해가며 유연한 코드를 작성할 수 있게 된다.
		 *  
		 * 상속관계로 형성된 모든 객체는 동일한 메세지를 수신할 수 있다.
		 * 하지만 객체별로 그 메세지에 응답하는 방식은 서로 다를 수 있다. (다형성)
		 * */
		Car car = new Car();
		car.soundHorn();
		car.run();
		car.soundHorn();
		car.stop();
		car.soundHorn();
		
		FireCar fireCar = new FireCar();
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
		
		fireCar.sprayWater();
		
		RacingCar racingCar = new RacingCar();
		racingCar.soundHorn();
		racingCar.run();
		racingCar.soundHorn();
		racingCar.stop();
		racingCar.soundHorn();
	}
}

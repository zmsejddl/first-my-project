package section11_다형성과_타입_변환.클래스에서의_타입_변환01;

class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

public class EX11_02 {

	public static void main(String[] args) {

		//예제 11-2 클래스의 자동 타입 변환 2
		
		Car c1 = new SchoolBus();	//1차 상속 관계가 아니더라도 자동 타입 변환 가능
		
		Bus b1 = new Bus();	//자동 타입 변환
		Bus b2 = new SchoolBus();	//자동 타입 변환
		
		Car c2 = new OpenCar();	//자동 타입 변환
		OpenCar oc = new SportsCar();	//자동 타입 변환
		//Bus b3 = new OpenCar(); <- 오류
		//Bus b2 - new SportsCar(); <- 오류
		
		/*
		 * 해설
		 * 21: OpenCar 클래스는 Car 클래스와 2차 상속 관계를 가지고 있기 때문에 자동 타입 변환이 가능합니다
		 * 23~24: OpenCar 클래스와 SportsCar 클래스는 Bus 클래스와 같은 상위 계층의 클래스 Car와 상속 관계는 맞지만,
		 * Bus 클래스와 직접적인 상속 관계가 아니므로 자동 타입 변환을 할 수 없습니다
		 */
	}

}

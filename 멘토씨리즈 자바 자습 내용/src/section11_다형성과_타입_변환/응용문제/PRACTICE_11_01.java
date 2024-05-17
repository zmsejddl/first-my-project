package section11_다형성과_타입_변환.응용문제;

class Car {}
class Bus extends Car {}
class SchoolBus extends Bus {}

class OpenCar extends Car {}
class SportsCar extends OpenCar {}

public class PRACTICE_11_01 {

	public static void main(String[] args) {
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		SchoolBus sb = (SchoolBus) new Car(); 
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportsCar();
		Car b3 = new OpenCar();
		OpenCar b4 = new SportsCar();
	}

}

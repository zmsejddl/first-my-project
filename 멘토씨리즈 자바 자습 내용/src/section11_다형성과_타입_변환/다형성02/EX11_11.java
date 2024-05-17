package section11_다형성과_타입_변환.다형성02;

public class EX11_11 {

	//예제 11-11 객체를 만들어줄 클래스
	
	EX11_10 computer1;
	EX11_10 computer2;
	
	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}
	
	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}
}

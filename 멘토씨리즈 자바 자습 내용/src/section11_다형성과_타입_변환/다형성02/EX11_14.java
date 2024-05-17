package section11_다형성과_타입_변환.다형성02;

public class EX11_14 {

	public static void main(String[] args) {

		//예제 11-14 ComputerRoom 객체를 만들어줄 클래스
		
		EX11_11 cr = new EX11_11();
		cr.computer1 = new EX11_13();
		cr.computer2 = new EX11_13();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}

}

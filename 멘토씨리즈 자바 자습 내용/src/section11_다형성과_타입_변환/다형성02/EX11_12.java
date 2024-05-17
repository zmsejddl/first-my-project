package section11_다형성과_타입_변환.다형성02;

public class EX11_12 {

	public static void main(String[] args) {

		//예제 11-12 객체를 만들어줄 클래스
		
		EX11_11 cr = new EX11_11();
		cr.computer1 = new EX11_10();	//Samsong computer1
		cr.computer2 = new EX11_10();	//Samsong computer2
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
	}

}

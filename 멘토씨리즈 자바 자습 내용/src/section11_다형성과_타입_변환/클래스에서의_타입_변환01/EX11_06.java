package section11_다형성과_타입_변환.클래스에서의_타입_변환01;

public class EX11_06 {

	//예제 11-6 강제 형 변환 1
	
	String riderName;
	int wheel = 2;
	
	public EX11_06(String riderName) {
		this.riderName = riderName;
	}
	
	void info() {
		System.out.println(riderName + "의 자전거는 " + wheel + "발 자전거입니다");
	}
	
	void ride() {
		System.out.println("씽씽");
	}
}

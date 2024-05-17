package section11_다형성과_타입_변환.응용문제;

class Speaker {
	String name;
	String getName() {
		return name;
	}
}
class RedSpeaker extends Speaker {
	@Override
	String getName() {
		return "빨간 스피커";
	}
	
}
class BlueSpeaker extends Speaker {
	@Override
	String getName() {
		return "파란 스피커";
	}
}

class Person {
	Speaker speaker;
	
	Person(Speaker speaker){
		this.speaker = speaker;
	}
	
	void turnOn() {
		System.out.println(speaker.getName() + "가 켜졌습니다");
	}
}

public class PRACTICE_11_03 {

	public static void main(String[] args) {

		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();
	}

}

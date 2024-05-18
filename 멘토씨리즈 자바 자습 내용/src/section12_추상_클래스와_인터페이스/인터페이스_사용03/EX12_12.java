package section12_추상_클래스와_인터페이스.인터페이스_사용03;

import section12_추상_클래스와_인터페이스.인터페이스_구현02.EX12_10;

public class EX12_12 implements EX12_10 {
	
	//예제 12-12 다형성

	int batteryCapacity = 35;
	boolean isOn = false;

	@Override
	public void powerOn() {	
		if(batteryCapacity > 30) {
			System.out.println("***폰이 켜졌습니다***\n");
			isOn = true;
		} else {
			System.out.println("배터리가 부족합니다...");
		}
	}

	@Override
	public void powerOff() {	
		System.out.println("***폰이 꺼졌습니다***\n");
		isOn = false;
	}

	@Override
	public boolean isOn() {	
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void watchUtube() {	
		if(batteryCapacity > 15) {
			System.out.println("--- U튜브 시청 중 ---");
			batteryCapacity -= 10;
			System.out.println("잔여 배터리..." + batteryCapacity + "%\n");
		} else {
			System.out.println("배터리가 부족합니다...");
			powerOff();
		}
	}

	@Override
	public void charge() {	//오버라이딩 하지 않으면 에러가 발생합니다
		if(batteryCapacity < EX12_11.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- 충전 중 ---");
			batteryCapacity += 5;
			System.out.println("잔여 배터리..." + batteryCapacity + "%\n");
		} else {
			System.out.println("충전할 필요가 없습니다...");
			System.out.println("잔여 배터리... " + batteryCapacity + "%");
		}
	}

}

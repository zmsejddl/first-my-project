package section13_내부_클래스.익명_클래스04;

interface buttonClickListener {
	public void click();
}

public class EX13_06 {
	//버튼 객체를 내부 클래스로 선언
	public class Button {
		private buttonClickListener listener;
		//리스너를 파라미터를 통해 받는다
		public void setButtonListner(buttonClickListener listener) {
			this.listener = listener;
		}
		//버튼 클릭 기능
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {

		//예제 13-6 익명 내부 클래스 예제 
		
		EX13_06 exam = new EX13_06();
		EX13_06.Button button = exam.new Button();
		
		button.setButtonListner(new buttonClickListener() {
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다");
			}
		});
		
		button.click();
	}

	/*
	 * 해설
	 * 3: 버튼 클릭 이벤트를 지닌 인터페이스를 선언합니다
	 * 9: 인스턴스 클래스로 버튼 객체를 선언합니다
	 * 12: 버튼 리스너를 외부로부터 받는 메서드를 구현합니다
	 * 16~20: 버튼을 클릭하는 메서드를 구현합니다. 리스너가 있을 때만 동작하도록 제어합니다
	 * 27~28: 외부 클래스를 통해서 버튼 클래스를 선언합니다
	 * 30~36: 인터페이스를 익명 클래스로 선언하여 버튼 기능을 구현해 추가합니다
	 * 38: 버튼을 클릭합니다
	 */
}

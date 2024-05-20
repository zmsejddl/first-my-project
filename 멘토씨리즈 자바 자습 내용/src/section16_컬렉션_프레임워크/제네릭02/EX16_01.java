package section16_컬렉션_프레임워크.제네릭02;

public class EX16_01 {

	//예제 16-1 데이터 저장 클래스
	
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public EX16_01() {
		data = new Object[defaultSize];
	}
	
	public EX16_01(int size) {
		data = new Object[size];
	}
	
	public void add(Object value) {
		data[size++] = value;
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	/*
	 * 해설
	 * 7: Object 타입 배열을 선언합니다
	 * 8: 배열 크기 변수를 선언합니다
	 * 9: 기본 배열 크기 사이즈를 선언합니다
	 * 11~13: 기본 생성자를 통해 배열을 기본 사이즈로 생성합니다
	 * 15~17: 클래스 선언 시 받은 크기로 배열을 생성합니다
	 * 19~21: 데이터가 들어오면 배열에 저장합니다
	 * 23~25: 배열에 데이터가 있으면 반환하고 아니면 null을 반환합니다
	 * 27~29: 저장된 데이터의 크기를 반환합니다
	 */
}

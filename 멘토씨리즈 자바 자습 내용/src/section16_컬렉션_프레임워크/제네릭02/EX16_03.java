package section16_컬렉션_프레임워크.제네릭02;

public class EX16_03<T> {

	//예제 16-3 제네릭을 통한 저장 객체 선언
	
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public EX16_03() {
		data = new Object[defaultSize];
	}
	
	public EX16_03(int size) {
		data = new Object[size];
	}
	
	public void add(T value) {
		data[size++] = value;
	}
	
	public T get(int index) {
		return (T)data[index];
	}
	
	public int size() {
		return size;
	}
	
	/*
	 * 해설
	 * 3: 클래스에 제네릭 <T>를 부여합니다
	 * 타입 <T>는 클래스 선언 시 타입을 지정합니다
	 * 19: 객체 선언 시 지정된 타입의 데이터를 저장합니다
	 * 23~25: 객체 반환 타입 <T>는 클래스 선언 시 지정합니다
	 */
}

package section19_파일_입출력.직렬화07;

import java.io.Serializable;

public class EX19_19 implements Serializable {

	//예제 19-19 Person class 생성

	private static final long serialVersionUID = 1L;
	private String myName;
	private int myAge;
	
	public EX19_19(String myName, int myAge) {
		this.setMyName(myName);
		this.setMyAge(myAge);
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	
}

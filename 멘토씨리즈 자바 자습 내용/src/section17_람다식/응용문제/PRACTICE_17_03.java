package section17_람다식.응용문제;

import java.math.BigDecimal;
import java.math.RoundingMode;

interface Calc {
	double round(int point);
}

public class PRACTICE_17_03 {

	public static void main(String[] args) {

		double val = 34.1254886;
		
		Calc cal = (point) -> {
			double val1 = new BigDecimal(val).setScale(point, RoundingMode.HALF_UP).doubleValue();
			return val1;
		};
		
		System.out.println("소수점 둘째 자리 반올림: " + cal.round(2));
	}

}

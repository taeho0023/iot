package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		int iValue1 = 100;
		int iValue2 = -100;
		double dValue1 = 3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = +iValue1;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short sValue = 100;
		//int 보다 크기가 작은 경우 결과는 int 타입으로 생성
		int sResult = -sValue;
		
		byte bValue = 100;
		int bResult = -bValue;
		
		long lValue = 100;
		long lResult = lValue;
		
	}
}

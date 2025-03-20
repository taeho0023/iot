package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		//단항연산자 : 증강 연산자(++,--)
		int x = 10;
		int y = 10;
		int z;
		
		//++연산자 : 피연사의 기존 값에 1을 더해준다.
		//++ 기호가 왼쪽(앞)에 있는 경우 : 먼저 1을 더하고 명령문을 실행
		System.out.println("++x = " + (++x)); // x =11
		
		
		//++ 기호가 오른쪽(뒤)에 있는 경우 : 명령문을 먼저 실행하고 다음 라인으러 넘어가면서 1이 증가
		System.out.println("x++ = " + (x++));// x = 11
		System.out.println("x = " + (x));//x = 12
		
		z = x++;
		System.out.println("z = " + z); //z = 12	
		System.out.println("x = " + x); //x = 13
		
		z = ++x + y--;
		
		System.out.println("z = " + z); //z = 24
		System.out.println("x = " + x);//x = 14
		System.out.println("y = " + y);//y = 9
		
		
	}

}

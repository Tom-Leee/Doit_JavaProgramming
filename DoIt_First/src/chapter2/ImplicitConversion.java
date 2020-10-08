package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// int 형 변수에 a에 정수 값 3을 대입
		int a = 3;
		// int a의 값을 double 자료형의 변수 d_a에 대입
		double d_a = a;
		
		//float형 변수 b에 실수 값 0.14를 대입
		float b = 0.14f;

		double sum = a+b;

		System.out.println(d_a);
		System.out.println(sum);
	}

}

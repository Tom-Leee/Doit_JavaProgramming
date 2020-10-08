package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		//double형 변수 a에 실수 값 3.14를 대입
		double a = 3.14;
		//double a의 값에 int 자료형의 변수 b에
		//강제 형 변환해서 대입
		int b = (int)a;
		
		//double형 변수 c에 실수 값 9.01을 대입
		double c = 9.01;
		//float형 변수 d에 실수 값 0.1을 대입
		//리터럴에 의해서 뒤에 식별자 F나 f를 기재
		float d = 0.99f;
		
		//두 개의 실수 c와 d가 각자 형 변환 되어서 더해진다. 
		int e = (int)c + (int)d;
		//두 개의 실수 c와 d가 더해지고나서 형 변환된다.
		int f = (int)(c+d);
		
		float sum = (float)c+d;
		System.out.println(sum);
		
		System.out.println(b);
		System.out.println(e);
		System.out.println(f);
	}

}

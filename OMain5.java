package Practice;

import java.util.Scanner;

//사각형의 둘레와 넓이를 구해서 조건에 따라 다른 글자가 출력되게 한다.
//가로, 세로 길이 입력받을 것 (실수로)
//둘레, 넓이를 각각 변수 따로 담고 출력할 것.
//출력 조건은 소수점 첫번째 자리까지.
//넓이가 200이 넘으면 [와 넓다!],[좀 좁네?]

public class OMain5 {

	public static void main(String[] args) {

		double ver, ho, round, area;
		Scanner s = new Scanner(System.in);

		System.out.print("가로 넓이 입력 : ");
		ho = s.nextDouble();

		System.out.print("세로 넓이 입력 : ");
		ver = s.nextDouble();

		round = (ver * 2)+(ho*2);
		area = ver * ho;
		
		System.out.println("====================");
		System.out.printf("가로 넓이 = %.1f\n세로 넓이 = %.1f\n사각형 둘레 = %.1f\n사각형 넓이 = %.1f\n",ho,ver,round,area);
		System.out.println("====================");
		System.out.println((area>=200.0)?"[와 넓다!]":"[좀 좁네?]");
		
		s.close();
		
	}

}

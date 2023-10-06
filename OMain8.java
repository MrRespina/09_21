package Practice;

import java.util.Scanner;

public class OMain8 {
	
	// 논리연산자 + 3항 연산자 , 이름과 나이를 받아서
	// 홍길동 : 2 강의장
	// 나이가 짝수 : 2 강의장
	// 그 외 : 1 강의장

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int age;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = s.nextLine();
		
		System.out.print("나이 : ");
		age = s.nextInt();
		
		/*	boolean 사용? (2번 연산)
		boolean b1 = name.equals("홍길동")==true?true:false;
		boolean b2 = (age%2)==0?true:false;
		
		System.out.println((b1||b2)==true?"2 강의장":"1 강의장");
		*/
		
		String classNo = (age%2==0 || name.equals("홍길동") ? "2 강의장":"1 강의장");
		System.out.println(classNo);
		
		s.close();

	}

}

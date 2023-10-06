package Practice;

import java.util.Scanner;

public class OMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		Scanner s = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.print("나이를 입력해주세요 : ");
		age = s.nextInt();
		
		System.out.println((age>20)? "어서오세요!" : "나가");
		System.out.println((age>60)? "강녕하세요!" : "안녕하세요!");
		
		s.close();
		
	}

}

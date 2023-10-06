package Practice;

import java.util.Scanner;

public class OMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		boolean check;
		Scanner s = new Scanner(System.in);

		System.out.println("====================");
		System.out.print("이름 입력 : ");
		name = s.nextLine();

		//String > 참조형 String이므로 Heap에 저장됨. > 저장된 곳 번지가 stack으로 전달.
		//boolean은 자료형의 기본으로 stack에 저장됨. 번지수 == 문자열은 무조건 false.
		System.out.println("Your Name = " + name);
		check = (name == "지병천");
		System.out.println("name test 1 = "+ check);
		
		//.equals()로 문자열 비교를 사용.
		check = (name.equals("지병천"));
		System.out.println("name test 2 = "+ check);

		s.close();

	}

}

package Practice;

import java.util.Scanner;

public class OMain_Pr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int age,height;
		
		System.out.println("=====================================");
		System.out.print("나이를 입력해주세요 : ");
		age = s.nextInt();
		
		System.out.print("키를 입력해주세요 : ");
		height = s.nextInt();
		
		boolean a = (age>=3 && height >=200);
		System.out.println("나이가 3살이 넘고 키가 2m 넘음 ? : "+a);

		boolean b = (age<=40 || height >=190);
		System.out.println("키가 1.9m가 넘거나 나이가 40 이하 ? : "+b);
		
		boolean c = (age>=10 || height <=200);
		System.out.println("키가 2m 이하거나 나이가 10살 이상 ? : "+c);
		
		boolean d = (age<=50 || age>=100);
		System.out.println("나이가 50세 이하거나 100세 이상 ? : "+d);
		
		boolean e = (age<=50 && height<=100);
		System.out.println("나이가 23세 이상이고 키가 1m 이하 ? : "+e);
		
		boolean f = (age<5 && height>100);
		System.out.println("키가 1미터 초과이고 나이가 5세 미만 ? : "+f);
		
		boolean g = (age>=10 ^ height>=150);
		System.out.println("나이가 10세 이상이거나 키가 1.5 이상 둘중 하나면 가능 ? : "+g);
		
		boolean h = ((age>=10 || height>=150)!=true);
		System.out.println("나이가 10세 이상이거나 키가 1.5 이상이 아님? : "+h);
		
		s.close();
		
	}

}

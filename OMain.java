package Practice;

import java.util.Scanner;

public class OMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		Scanner s = new Scanner(System.in);
		
		System.out.print("x 값 : ");
		x = s.nextInt();
		
		System.out.println("x += 2 = "+(x+=2));
		System.out.println("x -= 2 = "+(x-=2));
		System.out.println("x *= 2 = "+(x*=2));
		System.out.println("x /= 2 = "+(x/=2));
		
		s.close();

	}

}

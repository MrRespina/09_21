package Practice;

import java.util.Scanner;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,sum,min,mul,per;
		double div;
		String ch = "안녕";
		Scanner s = new Scanner(System.in);
		
		System.out.print("x 값 : ");
		x = s.nextInt();
				
		System.out.print("y 값 : ");
		y = s.nextInt();
		
		sum = x+y;
		min = x-y;
		mul = x*y;
		div = ((double)x/y);
		per = x % y;
		
		System.out.println("x = "+x+", y = "+y);
		System.out.printf("x + y = %d\n",sum);
		System.out.printf("x - y = %d\n",min);
		System.out.printf("x * y = %d\n",mul);
		System.out.printf("x / y = %.3f\n",div);
		System.out.println("x % y = "+per);
		System.out.println(ch+sum);
		
		System.out.println("x += 2 = "+(x+=2));
		System.out.println("x -= 2 = "+(x-=2));
		System.out.println("x *= 2 = "+(x*=2));
		System.out.println("x /= 2 = "+(x/=2));
		
		s.close();
				
		

	}

}

package Practice;

import java.util.Scanner;

// 이름, 키(cm), 몸무게(kg) 입력받아서 비만도 검사하는 프로그램.
// 표준체중 = (키 - 100) * 0.9
// 비만도 = (몸무게 / 표준체중) * 100
// 120 넘으면 비만, 120 넘지 않으면 아님
// 소수점 첫째자리까지 출력.

public class OMain6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name;
		double height,weight;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.print("당신의 이름 : ");
		name = s.nextLine();
		System.out.print("당신의 키 : ");
		height = s.nextDouble();
		System.out.print("당신의 체중 : ");
		weight = s.nextDouble();
		System.out.println("===================\n\n\n");
		
		System.out.println("===== 비만도 검사 프로그램 =====");
		System.out.printf("= 이름 : %s\n= 키 : %.1fcm\n= 체중 : %.1fkg\n",name,height,weight);
		Calc(name,height,weight);
		
		Thread.sleep(2000);
		System.out.println(".");
		Thread.sleep(2000);
		System.out.println(".");
		Thread.sleep(2000);
		System.out.println(".");
		System.out.println("종료하시려면 아무키나 눌러주십시오 .");
		name = s.nextLine();
		Thread.sleep(2000);
		System.out.println(".");
		
		s.close();
		
	}
	
	public static void Calc(String name,Double height,Double weight) {
		
		Double avgWeight,per;	
		avgWeight = ((height - 100) * 0.9);
		per = ((weight / avgWeight)*100);
		System.out.printf("= 표준 체중 : %.1fkg\n",avgWeight);
		System.out.printf("= 비만도 : %.1f%%\n",per);
		System.out.println((per>=120)?"= 당신은 [비만] 입니다. ":"= 당신은 [정상] 입니다.");
		System.out.println("==========================");	
		
	}

}

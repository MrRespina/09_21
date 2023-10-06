package Practice;

import java.util.Random;
import java.util.Scanner;

public class OMain7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		 * Random r = new Random(); int a = r.nextInt(10)+1; System.out.println(a);
		 */
		// 홀짝게임 , 1 랜덤으로 숫자 뽑기 , 2 홀짝 판단 , 3 내가 콘솔창에 홀짝 입력 후 , 4 랜덤 숫자와 비교 , 5 맞췄으면 정답 ,
		// 틀렸으면 떙

		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String my, ans;
		int i = r.nextInt(100) + 1;
		boolean b, check = false;

		b = (i % 2 == 1) ? true : false;
		ans = (b == true) ? "홀" : "짝";

		System.out.println("====================");

		while (check == false) {

			System.out.print("홀일까 짝일까? : ");
			my = s.nextLine();

			if (my.equals("홀") || my.equals("짝")) {
				
				System.out.println("...");
				Thread.sleep(1000);
				
				System.out.println("...");
				Thread.sleep(1000);
				
				System.out.println("...");
				Thread.sleep(1000);

				System.out.println("컴퓨터가 뽑은 숫자 = " + i);
				System.out.println("컴퓨터가 낸 답 = " + ans);
				System.out.println("내가 낸 답 = " + my);

				System.out.println((my.equals(ans) ? "[정답!]" : "[오답!]"));
				System.out.println("====================");
				break;

			} else {

				System.out.println("홀이나 짝을 입력해주세요!");

			}

		}

		s.close();

	}

}

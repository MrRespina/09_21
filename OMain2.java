package Practice;

import java.util.Scanner;

public class OMain2 {
	
	static int age;
	static int height;
	static double meter;
	static boolean done=false,a_Ok, h_Ok;

	public static void main(String[] args) {

		// 키와 나이를 입력 받고 각각 변수에 담아야 한다.
		// 내가 해당 놀이기구를 탈 수 있는지 확인할 것.	

		String machineName;
		Scanner s = new Scanner(System.in);
		
		System.out.println("==============================");
		
		while(done==false) {
			
			System.out.print("탑승할 놀이기구를 선택해주세요(롤러코스터,회전목마,자이로드롭,어린이 목마) : ");
			machineName = s.nextLine();
			
			if (machineName.equals("롤러코스터") == true) {

				System.out.println("롤러코스터의 신장 제한은 140cm 이상,12살 이상만 탑승 가능합니다.");
				System.out.print("신장을 입력해주세요 : ");
				height = s.nextInt();
				meter = (height / 100.0);		

				System.out.print("나이를 입력해주세요 : ");
				age = s.nextInt();
				
				heightCheck(height,140);
				ageCheck(age,12);

				if (a_Ok == true && h_Ok == true) {
					System.out.println("당신의 신장은 " + meter + "m 이고 나이는 " + age + "세 이므로 탑승이 가능합니다.");
				} else if (h_Ok == true && a_Ok == false) {
					System.out.println("당신의 신장은 " + meter + "m 이지만 나이는 " + age + "세 이므로 탑승이 불가합니다.");
				} else if (a_Ok == true && h_Ok == false) {
					System.out.println("당신의 나이는 " + age + "세 이지만 당신의 신장은 " + meter + "m 이므로 탑승이 불가합니다.");
				} else {
					System.out.println("당신의 신장은 " + meter + "m 이고 나이는 " + age + "세 이므로 탑승이 불가합니다.(둘 다 만족하지 못함.)");
				}
				done=true;
				break;

			} else if (machineName.equals("회전목마") == true) {
				System.out.println("회전목마는 8세 이상만 탑승 가능합니다.");
				System.out.print("나이를 입력해주세요 : ");
				age = s.nextInt();
				
				ageCheck(age,8);
				
				if(a_Ok == true) {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 가능합니다.");			
				}else {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 불가합니다.");
				}
				done=true;
				break;
					
			} else if (machineName.equals("자이로드롭") == true) {
				System.out.println("자이로드롭은 70세 이하만 탑승 가능합니다.");
				System.out.print("나이를 입력해주세요 : ");
				age = s.nextInt();
				
				ageCheckMin(age,70);
				
				if(a_Ok == true) {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 가능합니다.");			
				}else {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 불가합니다.");
				}
				done=true;
				break;

			} else if(machineName.equals("어린이 목마") == true) {
				System.out.println("어린이 목마는 5세 이상 12세 이하만 탑승 가능합니다.");
				System.out.print("나이를 입력해주세요 : ");
				age = s.nextInt();
				
				ageCheckAvg(age,12,5);
				
				if(a_Ok == true) {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 가능합니다.");			
				}else {
					System.out.println("당신의 나이는 "+age+"세 이므로 탑승이 불가합니다.");
				}
				done=true;
				break;
				
			}else {
				System.out.println("정확한 이름을 입력해주세요 !");
			}
							
		}
		
		s.close();
		

	}
	
	public static void ageCheck(int n,int agenum) {
		if (n >= agenum) {
			a_Ok = true;
		} else {
			a_Ok = false;
		}
	}
	
	public static void ageCheckMin(int n,int agenum) {
		if (n <= agenum) {
			a_Ok = true;
		} else {
			a_Ok = false;
		}
	}
	
	public static void ageCheckAvg(int n,int max,int min) {
		if (n >= min && n <= max) {
			a_Ok = true;
		} else {
			a_Ok = false;
		}
	}
	
	public static void heightCheck(int n,int heinum) {
		if (n >= heinum) {
			h_Ok = true;
		} else {
			h_Ok = false;
		}
	}
	
	public static void heightCheckMin(int n,int heinum) {
		if (n <= heinum) {
			h_Ok = true;
		} else {
			h_Ok = false;
		}
	}
}

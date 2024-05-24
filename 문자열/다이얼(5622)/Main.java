import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
		// Scanner 버전
		Scanner sc = new Scanner(System.in); //Scanner를 객체화

		String dial = sc.nextLine();//dial에 값을 저장
		int sum = 0;//변수 sum 0으로 초기화함
		char ch = ' ';//변수 ch를 초기화함
		for (int j = 0; j < dial.length(); j++) {//j가 0부터 dial의 길이보다 작을 때 까지 실행
			 ch = dial.charAt(j);//dial 값을 세분화한 값을 ch에 대입
			 	if (ch <= 67) { //ch가 67보다 작을 때
					 sum += 3;//sum에 3을 더함
				}
				else if (ch <=70) {//ch가 70보다 작을 때
					 sum += 4;//sum에 4를 더함
				}
				else if (ch <= 73) {//ch가 73보다 작을 때
					 sum += 5;//sum에 5를 더함
				}
				else if (ch <=76) {//ch가 76보다 작을 때
					 sum += 6;//sum에 6을 더함
				}
				else if (ch <= 79) {//ch가 79보다 작을 때
					 sum += 7;//sum에 7을 더함
				}
				else if (ch <= 83) {//ch가 83보다 작을 때
					 sum += 8;//sum에 8을 더함
				}
				else if (ch <= 86) {//ch가 86보다 작을 때
					 sum += 9;//sum에 9를 더함
				}
				else if (ch <= 90) {//ch가 90보다 작을 때
					 sum += 10;//sum에 10을 더함
				}
			}
		System.out.println(sum);//sum 출력

			}
	}

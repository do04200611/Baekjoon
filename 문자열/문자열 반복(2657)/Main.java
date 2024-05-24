import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		
		//BufferedReader 버전
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader를 객체화함
		int num = Integer.parseInt(br.readLine());//num에 값을 입력 받음
		
		for (int i = 0; i < num; i++) {//i가 0부터 num보다 작을 때 까지 실행
			StringTokenizer st =new StringTokenizer(br.readLine()," ");//값을 입력받고, 구분자는 띄워쓰기로 지정
			int num2 = Integer.parseInt(st.nextToken());//입력 받은 값 중 변수 num2에 대입
			String s = st.nextToken();//입력 받은 값 중 s에 대입
			
			for(int l = 0; l < s.length(); l++) {//l이 0부터 s의 길이보다 작을 때 까지 실행
				for (int j = 0; j < num2; j++) {//j가 0부터 num2보다 작을 때 까지 실행
					char ch = s.charAt(l);//값을 하나하나 세분화함
					System.out.print(ch);//ch의 값 출력	
				}
		}
			System.out.print("\n");// 줄 바꿈
		}
		
		// Scanner 버전
		
		Scanner sc = new Scanner(System.in); //Scanner를 객체화
		int num2 = sc.nextInt();//num2의 값을 입력 받음
		
		for (int i = 0; i < num2; i++) {//i가 0부터 num보다 작을 때 까지 실행
			
			int maximum = sc.nextInt();//maximum의 값을 입력 받음
			String s2 = sc.next();//문자열 입력 받음
			for (int j = 0; j < s2.length(); j++) {//j가 0부터 s2의 길이 보다 작을 때 까지
				for (int j2 = 0; j2 <maximum; j2++) {//j2의 값이 0부터 maximum보다 작을 때 까지
				char ch = s2.charAt(j);//s2를 세분화해서 ch에 대입
				System.out.print(ch);//ch 출력

				}
			}
			System.out.println();//줄바꿈
		}
		}
	}

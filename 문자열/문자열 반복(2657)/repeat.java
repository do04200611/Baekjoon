import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader 객체화함
		int num = Integer.parseInt(br.readLine());//num의 값을 입력 받음
		for (int i = 0; i < num; i++) {//i가 0부터 시작해서 num보다 작을 때 까지 실행
			StringTokenizer st =new StringTokenizer(br.readLine()," ");//값을 입력 받으면서, 구분자는 띄워쓰기
			int num2 = Integer.parseInt(st.nextToken());//값을 입력 받으면서 값을 받는 것은 num2로 지정
			String s = st.nextToken();//값을 입력 받으면서 값을 받는 변수는 s로 지정
			
			for(int l = 0; l < s.length(); l++) {//l이 0부터 시작해서, 문자열 s의 길이 보다 작을 때 까지 실행
				for (int j = 0; j < num2; j++) {//j가 0부터 시작해서, 문자열 j의 값이 num2보다 작을 때 까지 실행
					char ch = s.charAt(l);//입력받은 s의 세분화한 값을 ch에 대입
					System.out.print(ch);//ch의 값을 출력
				}
		}
			System.out.print("\n");//줄바꿈
		}
		}
	}

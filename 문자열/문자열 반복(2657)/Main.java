import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
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
		}
	}

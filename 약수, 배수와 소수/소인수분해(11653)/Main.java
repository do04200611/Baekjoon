import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 객체화함
		int M = Integer.parseInt(br.readLine()); // 소인수 분해할 변수 M을 입력받음
		StringBuilder sb = new StringBuilder();  // StringBuilder룰 객체화함
		
		for (int i = 2; i <= Math.sqrt(M); i++) { //2부터 M의 제곱근일 때 까지
			
			while (M % i == 0) {//M 나누기 i의 나머지 값이 0일 때
				M /= i; //M 나누기 i의 몫을 M에 대입
				sb.append(i+"\n");//몫을 저장
			}
		}
		if (M!= 1) {//M이 1이 아니면
			sb.append(M+"\n");//M값 저장
		}
		System.out.println(sb);//저장 된 M의 몫 출력
	}
}

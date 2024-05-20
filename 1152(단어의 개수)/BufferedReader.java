import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{

		//BufferedReader의 긴 버전
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// BufferedReader 객체화
		String s = br.readLine();//변수의 값을 입력 받음
		StringTokenizer st = new StringTokenizer(s," ");//입력 받은 s의 값을, 공백을 구분자로 설정해서 구분함
		System.out.println(st.countTokens());//입력받은 토큰 개수 출력

		//BufferedReader의 요약버전
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// BufferedReader 객체화
		StringTokenizer st = new StringTokenizer(br.readLine()," ");//값을 입력 받으면서, 공백을 구분자로 설정
		System.out.println(st.countTokens());//입력받은 토큰 개수 출력
		
	}
}

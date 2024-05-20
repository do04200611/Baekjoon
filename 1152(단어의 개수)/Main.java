import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{

		//Scanner의 긴 버전
		
		Scanner sc = new Scanner(System.in);// BufferedReader 객체화
		String s = sc.nextLine();//변수의 값을 입력 받음
		StringTokenizer st = new StringTokenizer(s," ");//입력 받은 s의 값을, 공백을 구분자로 설정해서 구분함
		System.out.println(st.countTokens());//입력받은 토큰 개수 출력
		
		//Scanner의 짧은 버전
		
		Scanner sc = new Scanner(System.in); //Scanner를 객체화함
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");//문자를 입력 받으면서, 공백으로 구분자로 설정함
		System.out.println(st.countTokens());//입력 받은 토큰의 개수를 출력
		
	}
}

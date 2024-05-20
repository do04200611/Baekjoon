import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		
		Scanner sc = new Scanner(System.in); //Scanner를 객체화함
		StringTokenizer st = new StringTokenizer(sc.nextLine()," ");//문자를 입력 받으면서, 공백으로 구분자로 설정함
		System.out.println(st.countTokens());//입력 받은 토큰의 개수를 출력
		
	}
}

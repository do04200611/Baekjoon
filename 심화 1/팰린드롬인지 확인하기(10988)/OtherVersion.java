import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{        			
		//scanner 버전
	   	Scanner sc = new Scanner(System.in); //Scanner 객체화
		
		String a = sc.nextLine();//a에 문자열 값 입력 받음
		StringBuffer sb = new StringBuffer(a);
		String areverse = sb.reverse().toString();//변수 areverse에 a를 거꾸로 한 값 대입
		
		if (a.equals(areverse)) {//a와 areverse가 같다면
			System.out.println(1);//1 출력
		}
		else {//그렇지 않으면
			System.out.println(0);//0출력
		}
		 }
}

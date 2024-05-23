import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main{
	public static void main(String[] args)throws Exception{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader를 객체화함
		String s = br.readLine();//변수 s에 값 입력 받음
		System.out.println(s.length());//s에 저장된 값의 길이 출력
	}
}

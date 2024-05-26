import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
   public static void main(String args[]) throws IOException{
	   	
	   //Scanner 버전
	   
	   	Scanner sc = new Scanner(System.in);// Scanner 객체화함
		String str = sc.next();//str에 값 입력 받음
		int ans = 1;//ans를 1로 초기화함
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();//str을 거꾸로 정렬함
		
		for(int j =0; j<str.length();j++) {//j가 0부터 str의 길이보다 작을 때 까지 실행
			if(str.charAt(j) != sb.charAt(j)) {//str값과 str을 거꾸로 정렬한 값이 틀리면
				ans = 0; // ans가 0이 됨
			}
		}
		System.out.println(ans);//ans 출력
		
		//BufferedReader 버전
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader 객체화함
		String str2 = br.readLine();//str2의 값을 입력받음
		
		StringBuilder sb2 = new StringBuilder(str2);
		sb2.reverse();//str2 값을 거꾸로 정렬함
		
		for(int i = 0; i<str2.length();i++) {//i가 0부터 str2 길이보다 작을 때 까지
			if(str2.charAt(i) != sb2.charAt(i)) {//str2 값과 str2 값을 거꾸로 정렬한 값이 틀릴 경우
				ans = 0;//ans 0으로 초기화함
			}
		}
		System.out.println(ans);//ans 값 출력
	}
   }

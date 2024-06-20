import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 객체화함
    	
    	Integer a , b;  //변수 a와 b를 선언함
    	StringTokenizer st;
    	while (true) { //참일 때만 실행
    	 st = new StringTokenizer(br.readLine()," ");  
    	 a = Integer.parseInt(st.nextToken()); //변수 a를 입력 받음
    	 b = Integer.parseInt(st.nextToken()); //변수 b를 입력 받음
    	 if (a==0 || b ==0) {  //a와 b가 0일 때 실행
    		 break;//종료
		}
    	 else if (b % a==0) { //b를 a로 나눌 때 나머지가 0이면
			System.out.println("factor"); //factor 출력
			continue; //계속 실행
		}
    	else if (a % b ==0) { //a를 b로 나눌 때의 나머지가 0일 때
			System.out.println("multiple"); //multiple 실행
			continue; // 계속 실행
		}
    	  
    	 else { //그밖에 경우에는
 			System.out.println("neither"); //neither 출력
			continue;  // 계속 실행
 		}
		}
		}
    }

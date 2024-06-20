import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	
    	//BufferedReader 버전
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //BufferedReader를 객체화함
    	
    	int k, n; // 변수 k,n 선언
    	 
    	StringTokenizer st = new StringTokenizer(br.readLine());  //StringTokenizer를 객체화함
    	k = Integer.parseInt(st.nextToken()); //변수 k에 입력받음
    	n = Integer.parseInt(st.nextToken()); //변수 n에 입력받음
    	
    	int count = 0; //count에 0으로 초기화함
    	int result = 0; //result에 0으로 초기화함
    	
    	for (int i = 1; i <= k; i++) { //i가 1부터 k값보다 크고 작을 때까지 실행
    		if (k % i == 0) { //k를 i로 나눌 때 나머지가 0일 때
    			count++; //count 값 증가
    		}
    		if (count == n) { //count가 n과 같을 때
    			result = i; //i값을 result에 대입
    			break; //실행 종료
    		}
		} 
    	System.out.println(result); //result값 출력
    	
    	//Scanner 버전
    	
    	Scanner sc = new Scanner(System.in); //Scanner를 객체화함
    	
    	int count1 = 0, total = 0; // count1과 total을 0으로 초기화함
    	int num = sc.nextInt(); //num을 값을 입력받음
    	int num2 = sc.nextInt(); //num2의 값을 입력 바음
    	
    	for (int j = 1; j <= num; j++) { //j가 1부터 num보다 같거나 작을 때 까지
			if (num%j == 0) { // num을 j 나눌 때 나머지가 0일 때
				count1++; //count1의 값 증가
			}
			if (count1 == num2) { //count1과 num2가 같을 때 실행
				total = j; //j 값을 total에 대입
				break; //종료
			}
		}
    	System.out.println(total); //total 값 출력
	}
}

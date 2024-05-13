import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{
	public static void main(String[] args)throws IOException{
		
		//Scanner 버전
		
		Scanner sc = new Scanner(System.in);//Scanner 객체화함  	
		sc.next();//문자열을 입력받음
		int sum =0;//sum 초기화
    	
    	for (int value : sc.next().getBytes()) {
			sum += value - '0';//value를 문자열에서 byte형으로 변환해서 sum과 합침
		}
    	System.out.println(sum);//sum 값 출력
    	
    	//BufferedReader 버전
    	
    	//BufferedReader 객체화함
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	br.readLine();//문자열 입력
    	int sum2 = 0;//sum2 초기화함
    	
    	for (int value : br.readLine().getBytes()) {
			sum2 += value - '0';//value의 요소 1가지를 byte 형으로 변환해서 sum2와 합침
		}
    	System.out.println(sum2);//sum2 출력
	}
}

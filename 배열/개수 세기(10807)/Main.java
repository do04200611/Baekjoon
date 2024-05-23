import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
   public static void main(String args[])throws IOException{
     Scanner sc = new Scanner(System.in); // 스캐너를 객체화함
     int a = sc.nextInt();// 변수 a에 값을 입력함
     int count =0;// 변수 count를 0으로 초기화함
     int ar[] = new int[a];//배열 a를 객체화함
		for (int i = 0; i <ar.length; i++) {
			ar[i]=sc.nextInt();// 배열ar에 요소를 입력받음
		}
		int x = sc.nextInt(); //값 x를 입력받음
		for (int i = 0; i <ar.length; i++) { //i가 배열의 크기가 클 때 까지
			if (ar[i] == x) {// 배열의 요소 입력 받은 x값하고 같으면
				count++; // count 값을 1씩 더함
			}
		}
		System.out.println(count);// count 값 출력
		
   }
}

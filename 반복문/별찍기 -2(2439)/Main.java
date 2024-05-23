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
     Scanner sc = new Scanner(System.in); // scanner를 객체화 함
     int a = sc.nextInt();//변수 a를 int로 선언

	   //공백 증가 시키기 위한 for문
		for (int i = 1; i <=a; i++) {// a보다 크거나 같을 때 까지
			for (int j = 1; j <=a-i; j++) {
				System.out.print(" ");// 공백 출력
			}
			//별찍기 위한 for문
			for (int k = 0; k < i; k++) {
				System.out.print("*");//*력			
				}
			System.out.println();
		}
   }
}

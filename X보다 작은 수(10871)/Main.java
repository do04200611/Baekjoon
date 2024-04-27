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
	   Scanner sc = new Scanner(System.in); //Scanner클래스를 객체화 함
	   
	   int A = sc.nextInt();//변수 A에 값을 입력받음
	   int B = sc.nextInt();//변수 B에 값을 입력 받음
	   int array [] = new int[A];//배열 array를 객체화함
	   
	   for (int i = 0; i < A; i++) {//i가 A보다 클 때 까지
		     array [i] =sc.nextInt();//array 배열에 요소를 입력 받음
	   }
	   for (int i = 0; i < array.length; i++) {//i가 array 배열의 길이 보다 클 때 까지
		if (array[i]<B) {//array 배열에 있는 요소 중에 변수 B보다 클 때 
			System.out.print(array[i]);//배열 array 요소 출력
		}
	} 
   }
}
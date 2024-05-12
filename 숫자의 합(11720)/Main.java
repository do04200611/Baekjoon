import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);//Scanner를 객체화		
		int a = sc.nextInt();//a 값을 입력받음
		String s =sc.next();//s의 값을 입력받음
		int sum =0;//sum을 초기화함
		
		for (int i = 0; i < a; i++) {//i를 0부터 해서 a보다 작을 때 까지
		sum += s.charAt(i)-'0';//s를 int
	
		}
	System.out.println(sum);
	
	}
}

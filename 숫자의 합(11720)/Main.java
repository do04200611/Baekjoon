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
	
	Scanner sc2 = new Scanner(System.in);//Scanner를 객체화		
	int a2 = sc2.nextInt();//a 값을 입력받음
	String s2 =sc2.next();//s의 값을 입력받음
	int sum2 =0;//sum을 초기화함
	
	for (int i = 0; i < a2; i++) {//i를 0부터 해서 a보다 작을 때 까지
	sum2 += s2.charAt(i)-'0';//s를 int

	}
System.out.println(sum2);

Scanner sc3 = new Scanner(System.in);//Scanner를 객체화		
int a3 = sc3.nextInt();//a 값을 입력받음
String s3 =sc3.next();//s의 값을 입력받음
int sum3 =0;//sum을 초기화함

for (int i = 0; i < a3; i++) {//i를 0부터 해서 a보다 작을 때 까지
sum3 += s3.charAt(i)-'0';//s를 int

}
System.out.println(sum3);

Scanner sc33 = new Scanner(System.in);//Scanner를 객체화		
int a33 = sc33.nextInt();//a 값을 입력받음
String s33 =sc33.next();//s의 값을 입력받음
int sum33 =0;//sum을 초기화함

for (int i = 0; i < a33; i++) {//i를 0부터 해서 a보다 작을 때 까지
sum33 += s33.charAt(i)-'0';//s를 int

}
System.out.println(sum33);

	}
}

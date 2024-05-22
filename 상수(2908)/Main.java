import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);//scanner를 객체화함
		
		String num = sc.next();//num의 값 입력 받음
		String num2 = sc.next();// num2의 값 입력 받음
		
		StringBuffer sb = new StringBuffer(num);//StringBuffer 객체화함
        String reverse = sb.reverse().toString();//num의 값을 뒤집은 것은 변수 reverse에 대입
        int a  = Integer.parseInt(reverse);//reverse의 값을 int형으로 변환
        
        StringBuffer sb2 = new StringBuffer(num2);//StringBuffer 객체화함
        String reverse2 = sb2.reverse().toString();//num2의 값을 뒤집은 것은 변수 reverse2에 대입
		int b = Integer.parseInt(reverse2);//reverse의 값을 int형으로 변환
        
        if (a > b) {//a의 값이 b보다 작으면
    		System.out.println(a);//a 값 출력
		}
		else {// 그렇지 않으면
			System.out.println(b);//b 값 출력
		}
        
        
        String num3 = sc.next();//num의 값 입력 받음
		String num4 = sc.next();// num2의 값 입력 받음
		
		StringBuffer sb3 = new StringBuffer(num3);//StringBuffer 객체화함
        String reverse3 = sb3.reverse().toString();//num의 값을 뒤집은 것은 변수 reverse에 대입
        int a2  = Integer.parseInt(reverse3);//reverse의 값을 int형으로 변환
        
        StringBuffer sb22 = new StringBuffer(num4);//StringBuffer 객체화함
        String reverse22 = sb22.reverse().toString();//num2의 값을 뒤집은 것은 변수 reverse2에 대입
		int b2 = Integer.parseInt(reverse22);//reverse의 값을 int형으로 변환
        
        if (a2 > b2) {//a의 값이 b보다 작으면
    		System.out.println(a2);//a 값 출력
		}
		else {// 그렇지 않으면
			System.out.println(b2);//b 값 출력
		}
        
        
        
        
        String num5 = sc.next();//num의 값 입력 받음
		String num6 = sc.next();// num2의 값 입력 받음
		
		StringBuffer sb5 = new StringBuffer(num5);//StringBuffer 객체화함
        String reverse5 = sb5.reverse().toString();//num의 값을 뒤집은 것은 변수 reverse에 대입
        int a5  = Integer.parseInt(reverse5);//reverse의 값을 int형으로 변환
        
        StringBuffer sb6 = new StringBuffer(num6);//StringBuffer 객체화함
        String reverse6 = sb6.reverse().toString();//num2의 값을 뒤집은 것은 변수 reverse2에 대입
		int b6 = Integer.parseInt(reverse22);//reverse의 값을 int형으로 변환
        
        if (a5 > b6) {//a의 값이 b보다 작으면
    		System.out.println(a5);//a 값 출력
		}
		else {// 그렇지 않으면
			System.out.println(b6);//b 값 출력
		}
        
		}
	}
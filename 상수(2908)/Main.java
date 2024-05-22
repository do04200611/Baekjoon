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
		}
	}

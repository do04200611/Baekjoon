import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
       //scanner 버전
		Scanner sc = new Scanner(System.in);//scanner를 객체화함
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");//num과 num2 값을 입력 받음
		
		int num = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());//num의 값 거꾸로 변환
		int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());// num2의 값 입력 받음
		
        System.out.println(num> num2 ? num:num2);//num이 num2보다 작으면 num, 작지 않으면 num2
        
        // ----------------------------------------------------------------------------------------------
        
        //BufferedReader 버전
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//BufferedReader를 객체화함
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");//num3와 num4를 입력 받고,
        
        int num3 = Integer.parseInt(new StringBuilder(st2.nextToken()).reverse().toString());//num3의 값 거꾸로 변환
        int num4 = Integer.parseInt(new StringBuilder(st2.nextToken()).reverse().toString());// num4의 값 입력 받음

        System.out.println(num3>num4 ?  num3 : num4);//num3이 num4보다 작으면 num3, 작지 않으면 num4
        
		}
	}

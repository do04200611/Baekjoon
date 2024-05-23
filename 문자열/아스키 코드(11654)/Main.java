import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc =new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		int a =  (int)c;
		System.out.println(a);
		
		InputStream input = System.in;
		int s = input.read();
		System.out.println(s);
		
}
}

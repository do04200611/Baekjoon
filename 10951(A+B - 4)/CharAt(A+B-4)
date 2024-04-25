import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader 객체화 함
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//BufferedWriter를 객체화함
		String str;//str을 String형으로 선언
 
		while( (str=br.readLine()) != null ){
		    
			int a = str.charAt(0) - 48; // a 값 입력 받음
			int b = str.charAt(2) - 48;//b값 입력 받음

			bw.write(a+b+"\n");// a와 b 값 합침
		
		}
		bw.flush();
		bw.close();
	}
}

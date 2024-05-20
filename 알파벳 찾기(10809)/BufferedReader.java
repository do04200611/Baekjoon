import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
			for (char c = 'a' ; c <= 'z'; c++) {
					sb.append(s.indexOf(c)+" "); // 문자열의 위치를 반환,
			}
			System.out.println(sb);
		}
	}

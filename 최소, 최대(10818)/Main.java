import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**==============================*
 * 작성자 : kimga
 * 작성일 : 2024. 4. 14.
 * 파일명 : CodingTest.java
 *프로그램 설명 :
 *==============================**/

/**
 * @author kimga
 *
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int ar[] = new int[a];
		int iMax, iMin =0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; st.hasMoreElements(); i++){
			ar[i] = Integer.parseInt(st.nextToken()); 
			
	}
		Arrays.sort(ar);
		System.out.println(ar[0]+" "+ar[a-1]);
	}
}

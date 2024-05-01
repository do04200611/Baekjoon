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
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int [] arr = new int[a];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
	        System.out.print(Arrays.stream(arr).min().getAsInt()+" "+Arrays.stream(arr).max().getAsInt());

	}
}

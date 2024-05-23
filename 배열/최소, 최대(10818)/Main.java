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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 객체화함
		
		int a = Integer.parseInt(br.readLine());//a에 값 저장함
		int ar[] = new int[a];// 배열 ar의 크기는 a며, 객체화함
		
		StringTokenizer st = new StringTokenizer(br.readLine());//StringTokenizer를 객체화함
		StringBuilder sb = new StringBuilder();//StringBuilder를 객체화함
		for (int i = 0; st.hasMoreElements(); i++){//뒤에 토큰이 있는 경우에만 실행함
			ar[i] = Integer.parseInt(st.nextToken()); //ar 배열에 요소를 입력받음
			
	}
		Arrays.sort(ar);// 배열 요소를 정렬함
		System.out.println(ar[0]+" "+ar[a-1]);// 배열의 최솟값과 최댓값 출력
	}
}

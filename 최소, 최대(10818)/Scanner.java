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
			Scanner sc = new Scanner(System.in);//Scanner를 객체화 함
			
			int a = sc.nextInt(); // 변수 a에 값을 저장함
			int [] arr = new int[a];// arr 배열을 객체화하면서, 크기는 a로 지정

			for (int i = 0; i < arr.length; i++) {//i가 arr의 길이보다 1만큼 작을 때까지 실행
				arr[i] = sc.nextInt();//arr의 배열의 요소를 입력받음

			}
	        System.out.print(Arrays.stream(arr).min().getAsInt()+" "+Arrays.stream(arr).max().getAsInt()); // 배열의 최대값과 최솟값 출력함

	}
}

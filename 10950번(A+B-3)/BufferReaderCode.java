import java.util.Iterator;
import java.util.Scanner;

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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 값 입력 받기
		int c = sc.nextInt();
		
		int a[] = new int[c];
		
		for (int i = 0; i<c; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			a[i] = A+B;
		}
		for (int k : a) {
			System.out.println(k);
		}
	}
}

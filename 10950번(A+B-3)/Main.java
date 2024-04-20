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
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int t = 0;
		while ( t != T  ) {
			t++;
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		for (int i =0; i !=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
			
		}
	}
}

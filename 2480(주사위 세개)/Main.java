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
		int A = 0, B =0 ,C=0, minute ;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A==B&&B==C&&A==C) { 
			System.out.println(A*1000+10000);
		} 
		else if (A == B || A ==C ){ 
			 System.out.println(Math.min(A,(Math.min(C, B)))*100+1000);
		}
		else if (B==C) {
			System.out.println(B*100+1000);
		}
		else if (A !=B && B!=C&&A!=C) {
			System.out.println(Math.max(A,(Math.max(C, B)))*100);
		}
	}
}


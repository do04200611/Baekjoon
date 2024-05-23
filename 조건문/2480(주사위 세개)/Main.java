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
		int A, B, C ; // 변수 3개 선언
		
		A = sc.nextInt(); // 입력 받은 값 중 1개 받음
		B = sc.nextInt();//입력 받은 값 중 1개 받음
		C = sc.nextInt();//입력 받은 값 중 1개 받음
		
		if (A==B&&B==C&&A==C) {// 변수 모두 같을 때 
			System.out.println(A*1000+10000);
		} 
		else if (A == B || A ==C ){ // 변수 2개가 같을 때
			 System.out.println(A*100+1000);
		}
		else if (B==C) {//변수 2개가 같을 때
			System.out.println(B*100+1000);
		}
		else if (A !=B && B!=C&&A!=C) {// 변수 모두 다를 때
			System.out.println(Math.max(A,(Math.max(C, B)))*100); // 최솟값 최댓 값 구하기
		}
	}
}


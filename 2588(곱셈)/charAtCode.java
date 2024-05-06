import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class CodingTest {
	public static void main(String[] args) throws IOException{
		//값 입력하기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 입력 받은 값 중 한 가지를 num으로 지정해서 받음
		String num2 = sc.next();//입력 받은 값 중 나머지 한가지를 num2로 지정 받음 
		sc.close();
		
		//곱셈 과정 출력 부분
		System.out.println(num * (num2.charAt(2) - '0')); 
		System.out.println(num * (num2.charAt(1) - '0'));
		System.out.println(num * (num2.charAt(0) - '0'));
		
		// 최종 결과 값
		System.out.println(num * Integer.parseInt(num2));		
	}
}


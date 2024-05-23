import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
			
			Scanner sc = new Scanner(System.in); //Scanner 객체화함
			
			int n = sc.nextInt();//n의 값을 저장 받음
			int m = sc.nextInt();//m의 값을 저장 받음
			int arr[] = new int[n];// 배열 arr을 객체화하며, 크기를 n으로 지정
			for (int i = 0; i < m; i++) {//i가 m의 크기보다 작을 때 까지
				int f = sc.nextInt();//f의 값 저장
				int b = sc.nextInt();//b의 값 저장
				int s = sc.nextInt();//s의 값 저장
			
			for (int j = f-1; j < b; j++) {//j를 f-1 부터 시작, b가 j보다 클 때 까지 실행
				arr[j] = s;//s의 값을 arr 배열 요소 값에 대입
			}
			}
			for (int baguni : arr) {
				System.out.print(baguni+" ");//baguni 값 출력
			}
		}
		}

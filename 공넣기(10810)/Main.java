import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 객체화함
			StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer 객체화함
			
			int n = Integer.parseInt(st.nextToken()); // n을 변수 선언
			int m = Integer.parseInt(st.nextToken());//m을 변수 선언
			int arr[] = new int[n];//배열 arr을 객체화하며, 크기 지정함
			for (int i = 0; i < m; i++) {//i값이 m보다 클 때 까지
				st = new StringTokenizer(br.readLine()," "); //StringTokenizer의 객체화함
				int f = Integer.parseInt(st.nextToken());//f의 값을 저장함
				int b = Integer.parseInt(st.nextToken());//b의 값을 저장함
				int s = Integer.parseInt(st.nextToken());//s의 값을 저장함
			
			for (int j = f-1; j < b; j++) {//j는 f-1 값이고, j가 b가 될 때 까지
				arr[j] = s;//arr 요소는 s의 값을 대입
			}
			}
			for (int baguni : arr) { 
				System.out.print(baguni+" ");//baguni 값 출력
			}
		}
		}

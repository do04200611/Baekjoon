import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int arr[] = new int[n];
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine()," ");
				int f = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
			
			for (int j = f-1; j < b; j++) {
				arr[j] = s;
			}
			}
			for (int baguni : arr) {
				System.out.print(baguni+" ");
			}
		}
		}

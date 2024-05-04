import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < m; i++) {
				int f = sc.nextInt();
				int b = sc.nextInt();
				int s = sc.nextInt();
			
			for (int j = f-1; j < b; j++) {
				arr[j] = s;
			}
			}
			for (int baguni : arr) {
				System.out.print(baguni+" ");
			}
		}
		}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int[] arr = new int[9];
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		Arrays.sort(arr);
		System.out.println(arr[8]);
		System.out.println(index);
 
	}
}
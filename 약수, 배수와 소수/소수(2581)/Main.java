import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = M;
		int sum = -1;
		
		for (int i = M; i < N; i++) {
			boolean check = true;
			if(i == 1) {
				check = false;
			}
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				if (min > i) 
					min	= i;
					sum += i;
			}
		}
		if(sum == -1) {
			System.out.println(sum);
		}else {
			System.out.println(sum+1);
			System.out.println(min);
		}	
	}
}
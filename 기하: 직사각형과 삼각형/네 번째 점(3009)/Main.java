import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		int x[] = new int[3];
		int y[] = new int[3];

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
//			System.out.println(x[i]+" "+y[i]);
		}
		
		int other_x = 0;
		int other_y =0;
		
		if (x[0] == x[1]) {
			other_x =x[2];
		}else {
			other_x =(x[0] == x[2]) ? (x[1]) : (x[0]);
		}
		if (y[0] == y[1]) {
			other_y = y[2];
		}else {
			other_y =(y[0] == y[2]) ? (y[1]) : (y[0]);
		}
		System.out.println(other_x+" "+ other_y);
	}
}
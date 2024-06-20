import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 객체화
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //BufferedWriter 객체화
		
		StringTokenizer st; 
		
		int x[] = new int[3]; //배열 x를 객체화함
		int y[] = new int[3]; //배열 y를 객체화함

		for (int i = 0; i < 3; i++) { //i가 0부터 3보다 작을 때 까지 실행함
			st = new StringTokenizer(br.readLine(), " "); 
			x[i] = Integer.parseInt(st.nextToken()); 
			y[i] = Integer.parseInt(st.nextToken());
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
		System.out.println(other_x+" "+ other_y); // 네 번째 점 출력
	}
}

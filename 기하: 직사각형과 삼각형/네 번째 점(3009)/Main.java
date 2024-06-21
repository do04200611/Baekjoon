import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader를 객체화함
		
		int x[] = new int[3]; //배열 x를 객체화하며, 크기를 3으로 지정
		int y[] = new int[3]; //배열 y를 객체화하며, 크기를 3으로 지정

		for (int i = 0; i < 3; i++) { //i가 0부터 3보다 작을 때 까지 실행
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //StringTokenizer를 객체화함
			x[i] = Integer.parseInt(st.nextToken()); //배열 x의 값을 입력 받음
			y[i] = Integer.parseInt(st.nextToken()); //배열 y의 값을 입력 받음
		}
		
		int other_x = 0; //네 번째 점의 값을 저장할 변수 출력
		int other_y =0; //네 번째 점의 값을 저장할 변수 출력
		
		if (x[0] == x[1]) { //첫번째 점과 2번째 점의 값이 같을 때
			other_x = x[2]; // 세번째 점의 값을 네번째 점의 값에 저장
		}
		else { //그 밖에
			
			//첫 번째 점과 세번째 점의 값이 같으면, 두 번째 점값 출력, 다르면, 첫번째 점값 출력
			other_x = (x[0] == x[2]) ?(x[1]) :(x[0]); 
			
		}
		if (y[0] == y[1]) { //첫번째 점과 2번째 점의 값이 같을 때
			other_y = y[2]; //세번째 점의 값을 저장
		}
		else { // 그밖에 경우에
			
			//첫 번째 점과 세번째 점의 값이 같으면, 두 번째 점값 출력, 다르면, 첫번째 점값 출력
			other_y = (y[0] == y[2]) ?(y[1]) :(y[0]);
			
		}
		System.out.println(other_x+" "+other_y); //네번째 점 출력
	}
}

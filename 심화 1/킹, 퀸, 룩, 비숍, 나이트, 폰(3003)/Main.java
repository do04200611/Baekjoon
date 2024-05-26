import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
		
		Scanner sc = new Scanner(System.in); //Scanner를 객체화
		
		int	origin[] = {1,1,2,2,2,8 }; //체스말의 원래 있어야할 개수 지정
		int input[] = new int[6]; // 부족한 말의 개수 크기를 6으로 지정

		for (int i = 0; i < 6; i++) { // i가 0부터 6보다 작을 때 까지 실행
			input[i] = sc.nextInt(); // 배열 input의 요소를 입력 받음
			System.out.print(origin[i]-input[i]+" ");
		}
		
	}
	}
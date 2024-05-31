import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner를 객체화함
		int i,j; //for문을 실행할지 말지의 기준점이 되는 변수 i,j 선언
		int x = 1, y=1;//변수 x,y를 1로 초기화
		int num[][] = new int[9][9];//이차원 배열 num 객체화함
		int max = 0;// 배열 최댓값을 저장할 변수 선언
		
		for ( i = 0; i <num.length; i++) { //i가 0부터 num의 길이까지 실행
			for ( j = 0; j < num.length; j++) {//j가 0부터 num의 길이까지 실행
				num[i][j] = sc.nextInt();//배열 요소 값을 입력 받음
			}
		}
		
		for ( i = 0; i < num.length; i++) {//i가 0부터 num의 길이까지 실행
			for ( j = 0; j < num.length ; j++) {//j가 0부터 num의 길이까지 실행
				if (num[i][j]>max) { //num의 요소를 max 값보다 클 경우
					max = num[i][j]; //max를 num의 요소 값으로 저장 
					x = i+1;//x는 i와 1을 합친 값으로 저장
					y = j+1;//y는 j와 1을 합친 값으로 저장
				}
			}
	}
	System.out.println(max); //max 값 출력
	System.out.print(x+" "+y);//x와 y 값 출력
}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);//Scanner를 객체화		
		
		HashSet<Integer> hash = new HashSet<Integer>(10); //HashSet 생성
		for (int i = 0; i < 10; i++) {//i가 0부터 10보다 작을 때 까지 실행
			int a = sc.nextInt(); //a의 값 저장함
			hash.add(a%42);//a를 42로 나눌 때의 나머지를 값 추가
		}
		System.out.println(hash.size());//hash의 크기 출력함
	}
}

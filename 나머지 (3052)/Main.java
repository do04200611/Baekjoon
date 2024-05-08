import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
			Scanner sc = new Scanner(System.in); // Scanner의 객체를 생성함
			HashSet<Integer> hash = new HashSet<Integer>(); // HashSet을 생성함
			int a[] = new int[10];//배열 a를 객체 생성함
			int count = 0;//변수 count를 초기화함
			for (int i = 0; i < a.length; i++) {// i가 0부터 a의 길이보다 작을 때 까지 for문 실행
				int num2 = sc.nextInt();//num2의 값을 저장함
				a[i] = num2%42;//배열 a의 요소를 num2를 42로 나눴을 때의 나머지를 요소로 지정함
				hash.add(a[i]);//hash 요소 지정함
			}
			for (int i = 0; i < hash.size(); i++) {//i가 0부터 hash 요소가 없을 때 까지
				count++; //count 값 증가
			}
			System.out.println(count);//count 값 출력
	}
}

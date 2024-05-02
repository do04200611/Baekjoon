import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader를 객체화
 
		int[] arr = new int[9];// arr 객체 배열 선언과 크기는 9로 지정함
		int max = 0;// 변수 max를 초기화함
		int index = 0;// 변수 index를 초기화함
		int count = 0;// 변수 count를 초기화함
		
		for(int i = 0 ; i<arr.length ; i++) {//i가 배열 길이 보다 작을 때 까지 
			arr[i] = Integer.parseInt(br.readLine());//배열 arr의 값을 입력 받음
		}
 
		
		
		for(int value : arr) {
			count++;//count를 1씩 증가함
			if(value > max) {//value보다 max가 클 때 실행함
				max = value;//max를 value 값 대입
				index = count;// index를 count 값 대입
			}
		}
		Arrays.sort(arr);//arr 배열 정렬함
		System.out.println(arr[8]);// arr 배열의 최댓값 출력
		System.out.println(index);//최댓값이 몇 번 째 있는지 출력함
 
	}
}

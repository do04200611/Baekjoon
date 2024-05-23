import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Scanner를 객체화함
		int arr[]= new int[9];// 배열 arr을 객체화하며, 크기를 9로 지정함
		
		int count = 0; // count를 초기화함
		int max = 0;// max를 초기화함
		int index = 0;// index를 초기화함
		
		for (int i = 0; i < arr.length; i++) { //i가 배열 길이보다 작을 때 까지 실행함 
			arr[i] = in.nextInt();// 배열 요소를 입력 받음
		}
		for (int i : arr) {// 
			count++;//count를 1씩 증가함
			if (i>max) {// i가 max 보다 작을 때 까지
				max = i; //max 변수에 i값을 대입함
				 index = count;// index를 count를 대입함
			}
		}
		System.out.println(Arrays.stream(arr).max().getAsInt()+" "+index);//arr 배열 요소의 최댓값과 index 출력함
	}
}

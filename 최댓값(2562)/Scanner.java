import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[]= new int[9];	
		
		int count = 0;
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i : arr) {
			count++;
			if (i>max) {
				max = i;
				 index = count;
			}
		}
		System.out.println(Arrays.stream(arr).max().getAsInt()+" "+index);
	}
}

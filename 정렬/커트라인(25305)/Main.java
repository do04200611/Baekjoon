import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner를 객체화함
		int max = sc.nextInt();
		int select = sc.nextInt();
		Integer[] num = new Integer[max];
		int i = 0;
		for ( i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		for ( int j = 0; j < num.length; j++) {
			if (select-1 == j) {
				System.out.println(num[j]);
			}
		}		
		}		
	}

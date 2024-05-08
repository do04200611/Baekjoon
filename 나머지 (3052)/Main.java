import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
			Scanner sc = new Scanner(System.in);
			HashSet<Integer> animals1 = new HashSet<Integer>();
			int num2;
			int a[] = new int[10];
			int b[] = new int[9];
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				num2 = sc.nextInt();
				a[i] = num2%42;
				animals1.add(a[i]);
			}
			for (int i = 0; i < animals1.size(); i++) {
				count++;
			}
			System.out.println(count);
	}
}

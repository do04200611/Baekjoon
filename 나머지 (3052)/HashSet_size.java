import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);//Scanner를 객체화		
		
		HashSet<Integer> hash = new HashSet<Integer>(10);
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			hash.add(a%42);
		}
		System.out.println(hash.size());
	}
}

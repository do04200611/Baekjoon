import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
			
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String a[] = new String[1000];
		for ( int i = 0; i < num; i++) { 
			String cha = sc.next();
			a[i] = cha.substring(0,1)+cha.substring(cha.length()-1,cha.length());
		}
		for(int i=0;i<num;i++) {
			System.out.println(a[i]);
		}
	}
}

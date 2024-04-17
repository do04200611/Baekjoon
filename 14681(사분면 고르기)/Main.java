import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ( x < 0) { //x가 음수 일 때
			if (y < 0) {// y가 음수 일 때
				System.out.println("3");
			}
			if (y>0) {// y가 양수 일 때
				System.out.println("2");
			}	
		}
		else if (x > 0) { // x가 양수 일 때
			if (y>0) {// y가 양수 일 때
				System.out.println("1");
			}
			if (y<0) { // y가 음수 일 때
				System.out.println("4");
			}
		}
	
	}
}

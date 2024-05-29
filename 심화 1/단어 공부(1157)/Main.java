import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[26];
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ('A' <= ch && ch <='Z') {
				num[ch-'A']++;
			}
			else if ('a'<= ch && ch <= 'z') {
				num[ch-'a']++;
			}
		}
		int max = -1;
		char lastch = '?';
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max ) {
				max = num[i]; 
				lastch = (char)(i+'A');
			}
			else if (num[i] == max) {
				lastch = '?';
			}
		}
		System.out.println(lastch);
	}
}
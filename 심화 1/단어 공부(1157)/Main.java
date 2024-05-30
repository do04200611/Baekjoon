import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체화
		int num[] = new int[26]; //배열 num의 크기를 26으로 지정
		String s = sc.next(); //s의 값을 입력받음
		
		for (int i = 0; i < s.length(); i++) {//i가 0부터 s의 길이보다 작을 때까지 실행함
			char ch = s.charAt(i);// s의 값을 세분화해서, ch에 대입함
			if ('A' <= ch && ch <='Z') {// ch가 A보다 크거나 같고, Z보다 ch가 작거나 같을 때
				num[ch-'A']++;//대문자 s의 값을 더함
			}
			else if ('a'<= ch && ch <= 'z') {// ch가 a보다 크거나 같고, z보다 ch가 작거나 같을 때
				num[ch-'a']++; //소문자 s의 값을 더함
			}
		}
		int max = -1; //max의 값을 -1로 지정
		char lastch = '?';//'?'로 지정함
		for (int i = 0; i < num.length; i++) {//i가 0부터 num의 길이보다 작을 때 까지 실행
			if (num[i] > max ) {//num의 요소 -1보다 작을 때
				max = num[i]; //num 배열 요소 값을 max에 대입
				lastch = (char)(i+'A');//i의 값을 A와 합침
			}
			else if (num[i] == max) {//num의 요소 값과 -1이 같으면
				lastch = '?';//?로 지정
			}
		}
		System.out.println(lastch);//lastch 값 출력
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		// Scanner 버전
		Scanner sc = new Scanner(System.in); //Scanner를 객체화
		char A =' ', B=' ', C=' ';
		char D = ' ', E=' ', F=' ';
		char G=' ', H=' ', I=' ';

		String dial = sc.nextLine();
		int sum = 0;
		char ch = ' ';
		for (int j = 0; j < dial.length(); j++) {
			 ch = dial.charAt(j);
			 	if (ch <= 67) {
					 sum += 3;
				}
				else if (ch <=70) {
					 sum += 4;
				}
				else if (ch <= 73) {
					 sum += 5;
				}
				else if (ch <=76) {
					 sum += 6;
				}
				else if (ch <= 79) {
					 sum += 7;
				}
				else if (ch <= 83) {
					 sum += 8;
				}
				else if (ch <= 86) {
					 sum += 9;
				}
				else if (ch <= 90) {
					 sum += 10;
				}
			}
		System.out.println(sum);

			}
	}

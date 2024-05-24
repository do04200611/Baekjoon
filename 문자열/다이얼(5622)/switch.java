import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		// Scanner 버전
		Scanner sc = new Scanner(System.in); //Scanner를 객체화

		String dial = sc.nextLine();//변수 dial에 값을 입력 받음
		int sum = 0;//변수 sum 초기화함
		char ch = ' ';// 변수 ch 초기화함
		for (int j = 0; j < dial.length(); j++) {//i가 0부터 시작해서 문자의 값의 길이보다 작을 때 까지 실행
			 ch = dial.charAt(j);//변수 dial의 값을 세분화함
			 	switch (ch) {//비교할 변수는 ch로 지정
				case 65: case 66: case 67: //값이 65~67까지 일 때
					sum += 3;//sum에 3을 더함
					break;//중지함
				case 68: case 69: case 70: //값이 68~70까지 일 때
					sum += 4;//sum에 4를 더함
					break;//중지함
				case  71: case  72:	case  73://값이 71~73까지
					sum += 5;//sum에 5를 더함
					break;//중지함
				case  74: case  75:	case  76://값이 74~76까지
					sum += 6;//sum에 6을 더함
					break;//중지함
				case  77: case  78: case  79://값이 77~79까지
					sum += 7;//sum에 7을 더함
					break;//중지함
				case  80: case  81: case  82: case  83://값이 81~83까지
					sum += 8;//sum에 8을 더함
					break;//중지함
				case  84: case  85:	case  86: //값이 84~86까지
					sum += 9;//sum에 9를 더함
					break;//중지함
				case  87:  case  88: case  89: case  90://값이 88 ~ 90까지
					sum += 10;//sum에 10을 더함
					break;//중지함	
				}
			}
		System.out.println(sum);//sum의 값 출력
			}
	}

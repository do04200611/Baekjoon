import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in); 
		int H = sc.nextInt();// 시를 나타 내는 변수 
		int M = sc.nextInt(); // 분을 나타내는 변수
		if(M < 45) { // 분이 45분 보다 적을 때
			H--;		// 시(hour) 1 감소
			M= 60 - (45 - M); 	// 분(min) 감소
		if(H < 0) {// 시간이 0보다 클 때 
			H = 23; // 시간을 23으로 변경
				
			}
			System.out.println(H + " " + M); // 시와 분을 나타냄
		}
		else { //그외의 경우(시와 분이 45보다 클 때의 경우)
			System.out.println(H + " " + (M - 45)); // 분-45 적용 후 시와 분을 출력 
		}
		
		
	}
}

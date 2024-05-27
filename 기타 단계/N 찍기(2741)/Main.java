import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in); //Scanner 객체화함
    	int num = sc.nextInt(); //num의 값을 입력 받음
    	
    	for (int i = 1; i <= num; i++) { //i가 1부터 num보다 크거나 같을 때 까지 실행
			System.out.println(i); // i의 값 출력
		}
    }

} 

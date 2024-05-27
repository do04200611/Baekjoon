import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in); //Scanner를 객체화함
    	int num = sc.nextInt(); //num의 값을 입력 받음
    	int a = num; //num의 값을 a에 대입함
    	for (int i = 0; i < num; i++) { //i가 0부터 num보다 작을 때 까지 실행함
        	System.out.println(a);//a값 출력
    		a--; //a값 감소함

    	}
    }
} 

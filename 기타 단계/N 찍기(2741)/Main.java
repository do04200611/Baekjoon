import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
    }

} 
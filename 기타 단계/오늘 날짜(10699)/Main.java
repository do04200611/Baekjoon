import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");//현재의 날짜를 출력하는 형식을 지정 
        Date now = new Date(); //Date를 객체화함        
        String nowTime2 = sdf2.format(now); //지정된 형식으로 포맷팅된 문자열을 반환함
	System.out.println(nowTime2);//현재 날짜 출력
	}

} 

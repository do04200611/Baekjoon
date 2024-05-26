import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();        
        String nowTime2 = sdf2.format(now);
		System.out.println(nowTime2);
		    }

} 
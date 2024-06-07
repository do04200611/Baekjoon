import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int k, i=0 ,n =0;   	
    	StringBuilder sb =new StringBuilder();
    	
    	k = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	while (n!= -1) {
	    		n = Integer.parseInt(st.nextToken());
				i++;
	    		sb.append(i+" 번째의 변수의 값은: "+n+"\n");
		}
    	
    	
    	System.out.println(sb);
    	

    	
	}
}

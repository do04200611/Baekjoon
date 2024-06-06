import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int k, n;   	
    	 
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	k = Integer.parseInt(st.nextToken());
    	n = Integer.parseInt(st.nextToken());
    	
    	int count = 0;
    	int result = 0;
    	
    	for (int i = 1; i <= k; i++) {
    		if (k % i == 0) {
    			count++;  			
    		}
    		if (count == n) {
    			result = i;
    			break;
    		}
		} 
    	System.out.println(result);
		}
		
		}
    

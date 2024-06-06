import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	
    	//BufferedReader 버전
    	
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
    	
    	//Scanner 버전
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int count1 = 0, total = 0;
    	int num = sc.nextInt();
    	int num2 = sc.nextInt(); 
    	
    	for (int j = 1; j <= num; j++) {
			if (num%j == 0) {
				count1++;
			}
			if (count1 == num2) {
				total = j;
				break;
			}
		}
    	System.out.println(total);
	}
}

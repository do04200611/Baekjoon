import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	Integer a , b;
    	StringTokenizer st;
    	while (true) {
    	 st = new StringTokenizer(br.readLine()," ");
    	 a = Integer.parseInt(st.nextToken());
    	 b = Integer.parseInt(st.nextToken());
    	 if (a==0 || b ==0) {
    		 break;
		}
    	 else if (b % a==0) {
			System.out.println("factor");
			continue;
		}
    	else if (a % b ==0) {
			System.out.println("multiple");
			continue;
		}
    	  
    	 else {
 			System.out.println("neither");
			continue;
 		}
		}
		}
    }

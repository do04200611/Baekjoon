import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class p{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	
    	StringBuilder b = new StringBuilder();
    	    	


    	int num1 = ((B%100)%10)*A;
    	int num2 = ((B%100)/10)*A;
    	int num3 = (B/100)*A;
    	int num4 = A*B;
    	
    	System.out.println(num1);
    	System.out.println(num2);
    	System.out.println(num3);
    	System.out.println(num4);
    }
}
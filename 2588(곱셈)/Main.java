import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int A = Integer.parseInt(br.readLine());
    	int B = Integer.parseInt(br.readLine());
    	
    	StringBuilder b = new StringBuilder();
    	    	
    	b.append(((B%100)%10)*A);
    	b.append('\n');
    	b.append(((B%100)/10)*A);
    	b.append('\n');
    	b.append((B/100)*A);
    	b.append('\n');
    	b.append(A*B);

    	System.out.println(b);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
//    	Scanner br = new Scanner(System.in);
    	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	
		int a = Integer.parseInt(br.readLine());
    	String s = "long ";
    		for (int i = 4; i != a; i=i+4) {
    			s = s+ "long " ;
    		}  
    		System.out.println(s+"int");
    		
		}
    }
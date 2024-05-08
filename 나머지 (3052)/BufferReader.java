import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
	public static void main(String[] args)throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			HashSet<Integer> animals1 = new HashSet<Integer>();
			int count = 0;
			for (int i = 0; i < 10; i++) {
				animals1.add(Integer.parseInt(br.readLine())%42);
			}
			for (int i = 0; i < animals1.size(); i++) {
				count++;
			}
			System.out.println(count);
	}
}

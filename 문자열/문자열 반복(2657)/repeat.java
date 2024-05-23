import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine()," ");
			int num2 = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int l = 0; l < s.length(); l++) {
				char ch = s.charAt(l);
				String str = String.valueOf(ch);
				str = str.repeat(num2);
				System.out.print(str);
		}
			System.out.print("\n");
		}
		}
	}

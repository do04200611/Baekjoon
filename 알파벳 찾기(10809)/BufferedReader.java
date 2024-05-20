import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int array[] = new int[26];
		Arrays.fill(array, -1); // 전부 다 -1로 초기화 
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i); //ch
				if(array[ch - 'a']==-1) { //-1인 경우에만 수정 (처음 등장하는 위치 조건)  
					array[ch-'a'] = i;  //array 배열 요소의 값을 i로 초기화함
				}
			}
		 for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
		}
	}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args)throws Exception{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int array[] = new int[26];
		Arrays.fill(array, -1); // 전부 다 -1로 초기화 
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
				if(array[ch - 'a']==-1) { //-1인 경우에만 수정 (처음 등장하는 위치 조건)  
					array[ch-'a'] = i;  
				}
			}
		 for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
			}
		}
	}

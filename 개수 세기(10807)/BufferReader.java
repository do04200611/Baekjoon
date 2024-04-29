import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
   public static void main(String args[])throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   int a = Integer.parseInt(br.readLine());
	   int ar[] = new int[a];
	   int count =0;// 변수 count를 0으로 초기화함

	   StringTokenizer  st = new StringTokenizer(br.readLine());

		for (int i = 0; i <ar.length; i++) {
			ar[i]=Integer.parseInt(st.nextToken());// 배열ar에 요소를 입력받음
		}
		int x =  Integer.parseInt(br.readLine());//값 x를 입력받음
		

		for (int i = 0; i <ar.length; i++) { //i가 배열의 크기가 클 때 까지
			if (ar[i] == x) {// 배열의 요소 입력 받은 x값하고 같으면
				count++; // count 값을 1씩 더함
			}
		}
		bw.write(count+"\n");
		bw.flush();
		bw.close();

   }
}

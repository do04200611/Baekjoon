import java.io.*;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.text.AbstractDocument.BranchElement;

public class Main {
    public static void main(String[] rgs) throws IOException {
    	    	
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader 객체화함
         int num = Integer.parseInt(br.readLine()); // 입력 받을 소수의 개수를 num에 저장
         StringTokenizer st = new StringTokenizer(br.readLine());//StringTokenizer를 객체화함
         
         int isPN, count = 0; //숫자와 소수의 개수를 파악할 변수 2개 선언
         
         for (int i = 0; i < num; i++) {
        	 isPN = Integer.parseInt(st.nextToken());
			for (int j = 2; j <= isPN; j++) {
				if (j == isPN) {
					count++;
				}
				if (isPN % j == 0) {
					break;

				}
			}
			}
     	System.out.println(count); 

	}
}
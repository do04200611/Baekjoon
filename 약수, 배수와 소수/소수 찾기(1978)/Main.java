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
         
         for (int i = 0; i < num; i++) {//i가 0부터 num보다 작을 때까지 실행
        	 isPN = Integer.parseInt(st.nextToken());//숫자 입력 받음
			for (int j = 2; j <= isPN; j++) {//2부터 시작해서 입력 받은 숫자 보다 크거나 같을 때 까지 실행
				if (j == isPN) {//j가 입력 받은 숫자와 같을 때
					count++;//개수 증가
				}
				if (isPN % j == 0) {//입력받은 수중에서 약수가 있을 때
					break; // 종료

				}
			}
			}
     	System.out.println(count); //개수 출력

	}
}

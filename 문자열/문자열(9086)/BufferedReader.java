import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReader{
	public static void main(String[] args)throws Exception{
			
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//BufferedReader를 객체화함
		int num = Integer.parseInt(br.readLine());//num의 값을 입력받음
		String a[] = new String[1000];//배열 a를 객체화하면서, 배열의 크기를 1000으로 지정함
		for ( int i = 0; i < num; i++) { //i가 0부터 시작해서, num보다 작을 때까지 실행함
			String cha = br.readLine();//cha를 값을 입력받음
			a[i] = cha.substring(0,1)+cha.substring(cha.length()-1,cha.length());//cha첫 글자 부터 끝 글자 까지 배열 a의 요소로 저장
		}
		for(int i=0;i<num;i++) {//i가 0부터 실행해서 num보다 작을 때 까지 실행함
			System.out.println(a[i]);//배열 a의 요소를 출력함
		}
	}
}

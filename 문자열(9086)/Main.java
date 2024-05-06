import java.util.Scanner;

public class Main{
	public static void main(String[] args)throws Exception{
			
		Scanner sc = new Scanner(System.in);//Scanner를 객체화함
		int num = sc.nextInt();//num의 값 받음
		String a[] = new String[1000];//a의 배열을 객체화하며, 크기를 1000으로 지정
		for ( int i = 0; i < num; i++) { //i가 0부터 num보다 작을 때 까지 실행
			String cha = sc.next();//cha에 값을 받음
			a[i] = cha.substring(0,1)+cha.substring(cha.length()-1,cha.length());//배열 a의 요소에 cha에 첫 번째 글자, 마지막 글자를 저장
		}
		for(int i=0;i<num;i++) {//i가 0부터 num보다 작을 때까지 실행
			System.out.println(a[i]);//배열 a의 요소를 출력
		}
	}
}

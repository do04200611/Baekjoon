import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
	public static void main(String[] args)throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader를 객체화함
			HashSet<Integer> hash = new HashSet<Integer>();//HashSet을 int형으로 생성함
			int count = 0;//변수 count 값 초기화함
			for (int i = 0; i < 10; i++) {//i가 0부터 9가 될 때 까지 실행함 
				hash.add(Integer.parseInt(br.readLine())%42);//
			}
			for (int i = 0; i < hash.size(); i++) {//i가 0부터 hash의 크기보다 작을 때 까지 실행함
				count++;// 변수 count 값 증가함
			}
			System.out.println(count);//count 값 출력
	}
}

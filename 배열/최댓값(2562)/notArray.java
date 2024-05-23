import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0; // count를 초기화함
        int max = 0;// max를 초기화함
        int index = 0;// index를 초기화함

        for (int i = 0; i < 9; i++) { //i가 배열 길이보다 작을 때 까지 실행함
            int arr = Integer.parseInt(br.readLine()); // 배열 요소를 입력 받음
            count++;//count를 1씩 증가함
            if (arr > max) {// i가 max 보다 작을 때 까지
                max = arr; //max 변수에 i값을 대입함
                index = count;// index를 count를 대입함

            }
        }
        System.out.println(max);//arr 배열 요소의 최댓값과 index 출력함
        System.out.println(index);//arr 배열 요소의 최댓값과 index 출력함

    }
}

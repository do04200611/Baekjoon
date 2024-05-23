import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시간
        int b = sc.nextInt(); // 분
        int c = sc.nextInt(); // 요리하는데 걸리는 시간
         
           a += c / 60; // 시간 + 요리하는데 걸리는 시간을 60에서 나눈 몫
           b += c % 60; // 분 + 요리하는데 걸리는 시간은 60에서 나눈 나머지 
        
        if(b>=60){ // 만약 분이 60을 넘긴다면
            b -= 60; // 분에서 60을 빼고
            a += 1; // 시간에서 1을 더한다 
            
        }
        
        if(a >= 24){ // 만약 시간이 24를 넘긴다면 
            a -= 24; // 시간에서 24를 감한다 
        }
        
        System.out.println(a + " " + b);
    }
}
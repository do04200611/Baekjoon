import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			int num = sc.nextInt();
			
			if (num == -1) {
				break;
			}
			
			int array[] = new int[num];
			int sum = 0;
			
			for (int i = 1; i <= num; i++) {
				if (num%i ==0 && i != num) {
					array[i] = i;
					sum += i;
				}
			}
			
			if (sum != num) {
				sb.append(num+" is NOT perfect. \n");
				continue;
			}
			
		    sb.append(num + " = 1"); 
		    
			  for(int i = 1; i <= num; i++){ 
	                if(array[i-1] != 0 && array[i-1] != 1){
	                    sb.append(" + " + array[i-1]);
	                }
	            }
			  
	            sb.append("\n");
	        }
			sc.close();
	        System.out.println(sb);
		}
}
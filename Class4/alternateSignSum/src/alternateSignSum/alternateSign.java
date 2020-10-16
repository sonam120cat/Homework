package alternateSignSum;

import java.util.Scanner;

public class alternateSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		int flag = 0;
		
		for(double i = 1 ; i<=n;i++) {
			if(flag == 0) {
			sum = sum + 1/i; 
			flag = flag - 1;
			}
			else if(flag == -1) {
				sum = sum-1/i;
				flag = flag - 1;
			}
		}
		System.out.println(sum);

	}

}

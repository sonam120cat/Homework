package febonacciSeries;

import java.util.Scanner;

public class febonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		
		for(int i = 0;i < num ;i++) {
			System.out.print(n1 + " ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			
		}
	}

}

package armStrongNumber;

import java.util.Scanner;

public class armStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int m = num;
		int sum = 0;
		int rem = 0;
		for(int i = 1 ; i<=500 ; i++) {
			rem = m % 10;
			sum = sum + (rem * rem * rem);
			m = m/10; 
		}
		
		if(num == sum)
			System.out.println("The number " +num + " is an armstrong number");
		
		else 
			System.out.println("The number " +num+ "  is not an armstrong number");
	}

}

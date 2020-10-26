package febonacciRecursion;

import java.util.Scanner;

public class febonacciRecursion {
	
	public static int febonacci(int n) {
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		
		int fib1 = febonacci(n -1 );
		int fib2  = febonacci(n-2);
		int currentFib = fib1 + fib2;
		return currentFib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int val = febonacci(n);
		System.out.print(val);

	}

}

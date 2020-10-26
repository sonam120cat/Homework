package factRecursion;

import java.util.Scanner;

public class factRecursion {
	
	public static int  factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		
		 int fact = n * factorial(n -1 );
		 return fact;
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int val = factorial(n);
		System.out.println(val);
		
		

	}

}

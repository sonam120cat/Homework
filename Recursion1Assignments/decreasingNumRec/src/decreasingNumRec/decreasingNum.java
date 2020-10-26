package decreasingNumRec;

import java.util.Scanner;

public class decreasingNum {
	
	public static void printNums(int n) {
		if(n == 0) {
			return;
		}
		
		System.out.println(n);
		printNums(n-1);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		printNums(num);

	}

}

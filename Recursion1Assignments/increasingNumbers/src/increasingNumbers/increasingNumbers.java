package increasingNumbers;

import java.util.Scanner;

public class increasingNumbers {
	
	public static void increasingNum(int n) {
		if(n == 0) {
			return;
		}
		
		
		increasingNum(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		increasingNum(n);

	}

}

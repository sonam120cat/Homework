package powerByRecursion;

import java.util.Scanner;

public class powByRecursion {
	public static int powerBetter(int num , int pow) {
		if(pow == 0) {
	        return 1;
		}
		
		if(pow == 1) {
			return num;
		}
		int powNum = powerBetter(num , pow/2);
		
		if(pow % 2 == 0) {
			return powNum * powNum;
		}
		else {
			return powNum * powNum * num;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number");
		int n = scn.nextInt();
	System.out.print("Enter the power");
	int power = scn.nextInt();
		int k = powerBetter(n,power);
		System.out.println(k);

	}

}

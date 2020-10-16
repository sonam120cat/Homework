package reverseTriangleNumber;

import java.util.Scanner;

public class reverseTriangleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1 ;i<num ; i++) {
			
			for(int j = 2 * (num-i) ; j> 0 ; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0 ; k < 2 * i - 1 ; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		

	}

}

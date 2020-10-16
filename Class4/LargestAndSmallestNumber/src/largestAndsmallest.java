import java.util.Scanner;

public class largestAndsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		int number = 0;
		
		
		for(int i = 0 ;i < n ; i++) {
			System.out.print("Enter the numbers: ");
			
			number = sc.nextInt();
			System.out.println(number);
			if(number>max) {
				max = number;
			}
			if(number<min) {
				min = number;
			}
			
		}
		System.out.println(number);
		System.out.println(max);
		System.out.println(min);
		

	}
	

}

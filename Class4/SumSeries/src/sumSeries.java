import java.util.Scanner;

public class sumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		
		for(double i = 1 ; i<= n ;i++) {
			sum = sum + 1/i ;
			
		}
		System.out.println(sum);

	}

}

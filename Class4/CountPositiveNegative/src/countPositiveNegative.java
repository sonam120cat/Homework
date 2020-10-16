import java.util.Scanner;

public class countPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0 ;i < n1 ; i++) {
			System.out.println("Enter the numbers: ");
			int n = sc.nextInt();
			
			if(n == 0) {
				count0++;
			}
			else if(n>0) {
				count1++;
			}
			
			else if(n < 0) {
				count2++;
			}
		}
		System.out.print("Zero:" + " " + count0 +" " + "Positive Numbers: " +  " " +count1+ " " + "Negative Numbers:" + " " + count2);

	}

}

import java.util.Scanner;

public class TitltedLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0;i<num ; i++) {
			for(int j = 0 ; j< 2*(num - i) ; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
		}
		 System.out.println();
		}
	}
	

}

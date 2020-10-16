import java.util.Scanner;

public class lastPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1;i<=n ; i++) {
			for(int j = 1;j<=(2*n)-(2*i) ; j++) {
				System.out.print(" ");
			}
			for(int k = i ;k>=1;k--) {
				System.out.print(k);
			}
			
			if(i>=2) {
				for(int p = 2;p<=i ; p++) {
					System.out.print(p);
				}
			}
			System.out.println();
		}

	}

}

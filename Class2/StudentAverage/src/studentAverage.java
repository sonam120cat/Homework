import java.util.Scanner;
public class studentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		double avg = (num1 + num2 + num3) / 3;
		
		if(avg > 90 && avg <100) {
			System.out.println("A");
		}
		
		else if(avg > 80 && avg <89) {
			System.out.println("B");
		}
		else if(avg >70 && avg <79) {
			System.out.println("C");
		}
		
		else if(avg >60 && avg <69) {
			System.out.println("D");
		}
		
		else if(avg >0 && avg < 59) {
			System.out.println("F");
		}

	}

}

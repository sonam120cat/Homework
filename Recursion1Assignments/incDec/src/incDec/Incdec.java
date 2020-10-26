package incDec;

public class Incdec {
	
	static int LIMIT = 5; 
	public static void fun2(int n) 
	{ 
		if (n <= 0) return; 
		if (n > LIMIT) return; 

		System.out.println(String.format("%d ", n)); 
		fun2(n + 1); 
		System.out.println(String.format("%d ", n)); 
	} 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun2(1);

	}

}

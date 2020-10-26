package minArray;

public class minArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,3,2,1,44,101,79};
		System.out.println(min(a,0));

	}
	
	public static int min(int a[],int vindx) {
		if(a.length - 1 == vindx) {
			return a[vindx];
		}
		
		int minOfRest  = min(a,vindx + 1);
		
		if(minOfRest < a[vindx]) {
			return minOfRest;
		}
		
		else {
			return a[vindx];
		}
	}

}

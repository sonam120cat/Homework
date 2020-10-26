package maximumRecursion;

public class maximumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,4,3,2,1,44,101,79};
		System.out.println(max(a,0));
	}

	
	public static int max(int a[],int vindx) {
		if(a.length - 1 == vindx) {
			return a[vindx];
		}
		
		int maxOfRest  = max(a,vindx + 1);
		
		if(maxOfRest > a[vindx]) {
			return maxOfRest;
		}
		
		else {
			return a[vindx];
		}
	}


	}



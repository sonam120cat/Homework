package findAnIndex;

public class FindAnIndex {
	public static int printIndex(int a[], int k,int vidx) {
		if(vidx == a.length) {
			return 0;
		}
		if(a[vidx] == k) {
			return vidx;

	}
	
		
		int val =  printIndex(a,k,vidx+1);
		
		return vidx;

		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,6,3,3,3,4,1,3 ,4};
		printIndex(a,3,0);

	}

}

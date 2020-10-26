package firstIndex;

public class firstIndex {
	
	public static int  firstIndex(int a[] , int k , int vidx) {
		if(vidx == a.length) {
			return -1;
		}
		
		if(a[vidx] == k) {
			return vidx;
		}
		
		int idx = firstIndex(a , k , vidx + 1);
		return idx;
		
		
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,6,3,3,3,4,1,3,4};
		int val = firstIndex(a,4,0);
		System.out.print(val);

	}

}

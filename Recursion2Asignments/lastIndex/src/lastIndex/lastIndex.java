package lastIndex;

public class lastIndex {
	public static int lastOccur(int a[] , int n,int vidx) {
		if(vidx == a.length) {
			return -1;
		}
		int idx = lastOccur(a,n,vidx+1);
		if(idx != - 1) {
			return idx;
		}
		else {
			if(a[vidx] == n) {
				return vidx;
			}
			else return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,6,3,3,3,4,1,3,4};
		int val = lastOccur(a,6,0);
		System.out.print(val);

	}

}

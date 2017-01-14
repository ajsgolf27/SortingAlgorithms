
public class quickSort {
	private int x = 0;
	private int i = 0;
	private int q = 0;
	
	public int [] Quicksort(int[] A, int p, int r){
		
		if (p < r){
			q = Partition(A, p, r);
			Quicksort(A,p,q - 1);
			Quicksort(A,q+ 1,r);
		}
		
		return A;
		
	}
	
	public int Partition(int [] A, int p, int r){
		x = A[r];
		i = p - 1;
		int temp = 0;
		for(int j = p; j < r; j++){
			if (A[j] <= x){
				
				i = i + 1;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			
		}
		temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		return i + 1;
	}
	
}

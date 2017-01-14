
public class heapsort {
	private int l = 0;
	private int r = 0;
	private int largest = 0;
	private int temp = 0;
	private static int n = 0;
	
	
	public int [] Heapsort(int[] A){
		n = A.length - 1;
		BuildMaxHeap(A);
		for(int i = n; i > 0; i--){
			temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			n = n - 1;
			MaxHeapify(A,0);
			
		}
		return A;
		
	}
	
	private int [] BuildMaxHeap(int[] A){
		
		for(int i = ((n)/2); i >= 0; i--){
			MaxHeapify(A,i);
		}
		return A;
		
	}
	
	private void MaxHeapify(int[] A, int i){
		
		l = Left(i);
		r = Right(i);
		
		if (l <= n && A[l] > A[i]){
			largest = l;
			
		}else{
			largest = i;
		}
		
		if (r <= n && A[r] > A[largest]){
			largest = r;
		} 
		
		if(largest != i){
			temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			MaxHeapify(A,largest);
		}
	}
	
	public int Parent(int i){return i/2;}
	
	public int Left(int i){return 2*i;}
	
	public int Right(int i){return 2 * i+ 1;}
	
}

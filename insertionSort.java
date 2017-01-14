
public class insertionSort {

	public int[] InsertionSort(int[] A){
		int key = 0;
		int i = 0;
		for(int j = 1; j < A.length; j++){
			key = A[j];
			i = j-1;
			while(i > -1 && A[i] > key){
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = key;
		}
		return A;
	}
}

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class Main {
	private static int [] [] matrix = new int[10] [21000];
	
	private static long avgTime = 0;
	public static void main(String[] args) {
		insertionSort is = new insertionSort();
		quickSort qs = new quickSort();
		heapsort hs = new heapsort();
		

		Random rand = new Random(); 
		Vector<Long> times1 = new Vector<Long>();
		Vector<Long> times2 = new Vector<Long>();
		Vector<Long> times3 = new Vector<Long>();
		 
	
		
		for(int i = 0; i < 10; i ++){
			for(int j = 0; j < 21000; j++){
				matrix[i][j] = rand.nextInt(50000);
				 
			}
		}
		
		System.out.println("insertion sort\n");
		for (int n = 1000; n < 21000; n = n + 1000){
			for(int i = 0; i < 10; i++){
				int [] a = createCopy(i,n);
				long startTime = System.currentTimeMillis();
				is.InsertionSort(a);
				long endTime = System.currentTimeMillis();
				long finalTime = endTime - startTime;
				avgTime = avgTime + finalTime;
				
			}
			times1.add(avgTime/10);
		 
		}
		Enumeration vEnum1 = times1.elements();
		while(vEnum1.hasMoreElements())
	         System.out.print(vEnum1.nextElement() + " ");

////////////////////////heapsort//////////
		System.out.println("\nheap sort\n");
	avgTime = 0;
	for (int n = 1000; n < 21000; n = n + 1000){
		for(int i = 0; i < 10; i++){
			int [] b = createCopy(i,n);
			long startTime = System.currentTimeMillis();
			hs.Heapsort(b);
			long endTime = System.currentTimeMillis();
			long finalTime = endTime - startTime;
			avgTime = avgTime + finalTime;
			
		}
		times2.add(avgTime/10);
	 
	}
	Enumeration vEnum2 = times2.elements();
	while(vEnum2.hasMoreElements())
         System.out.print(vEnum2.nextElement() + " ");


////////////////////////quicksort//////////
	System.out.println("\nquick sort\n");
	avgTime = 0;
for (int n = 1000; n < 21000; n = n + 1000){
	for(int i = 0; i < 10; i++){
		int [] c = createCopy(i,n);
		long startTime = System.currentTimeMillis();	
		qs.Quicksort(c, 0, n -1);
		long endTime = System.currentTimeMillis();
		long finalTime = endTime - startTime;
		avgTime = avgTime + finalTime;
		
	}
	
	times3.add(avgTime/10);
 
}
Enumeration vEnum3 = times3.elements();
while(vEnum3.hasMoreElements())
     System.out.print(vEnum3.nextElement() + " ");

}
	
	public static int [] createCopy( int row, int length){
		int [] b = new int [length];
		for(int i = 0; i < length; i++){
			
			b[i] = matrix[row][i];
			

		}
		return b;
		
	}

}

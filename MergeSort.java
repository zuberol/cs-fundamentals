import java.util.*;
import java.util.Arrays;

class MergeSort2 {
	
	// merge two sorted arrays
	public static int [] merge(int [] a, int [] b){
		int [] merged = new int [a.length + b.length];
		
		int i=0, j=0, m=0;
		while(i != a.length && j != b.length) {
			if(i != a.length && j != b.length) {
				if(a[i] < b[j]) merged[m++] = a[i++];
				else merged[m++] = b[j++];
			}
		}
		while(i != a.length) merged[m++] = a[i++];
		while(j != b.length) merged[m++] = b[j++];
		
		return merged;
	}
	
	public static int [] mergeSort(int [] data){
		if(data.length == 1) return data;
		int half = data.length/2; 
		int [] sortedLeft = mergeSort(Arrays.copyOfRange(data, 0, half));
		int [] sortedRight = mergeSort(Arrays.copyOfRange(data, half, data.length));
		return merge(sortedLeft, sortedRight);
	}


	public static void main(String [] args){
		int [] data = {5, 20, 3, 14, 100};
		data = mergeSort(data);
		System.out.println("Sorted data: ");
		for(int i : data) System.out.print(i+" ");
		System.out.println();

	}
}

import java.util.Arrays;

class InsertionSort {
	static void swap(int [] arr, int a, int b) {
		int handler = arr[a];
		arr[a] = arr[b];
		arr[b] = handler;
	}

	static void insertionSort(int [] data) {
		for(int i=0; i<data.length; ++i) {
			int j = i;
			while(j > 0 && data[j-1] > data[j]) swap(data, j-1, j--);
		}
	}

	public static void main (String [] args) {
		int data[] = {10,1,6,5,4,8,0,5,1};
		insertionSort(data);
		Arrays.stream(data).forEach(System.out::println);
	}
}

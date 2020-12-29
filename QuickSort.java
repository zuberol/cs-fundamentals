import java.util.Random;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int [] data, int start, int end) {
        if(start < end) {
            int p = partition(data, start, end);
            quickSort(data, start, p-1);
            quickSort(data, p+1, end);
        }
    }
    private static int partition(int [] data, int start, int end) {
        int pval = getPivotVal(data, start, end);
        int i = start-1;
        int j;
        for(j=start; j<end; ++j) {  
            if(data[j]<=pval)
                swap(data, ++i, j);
        }
        swap(data, i+1, end);
        return i+1;
    }
    private static void swap(int [] arr, int i1, int i2) {
        int handle = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = handle;
    }
    private static int getPivotVal(int [] arr, int lowerBound, int upperBound) {
        return arr[upperBound];
        // Random r = new Random();
        // return Math.abs(
        //     (r.nextInt() % (upperBound - lowerBound + 1)) + lowerBound
        // );
    }
    
    public static void main(String[] args) {
        int [] arr  = {1,7,4,2,6,8,4,5,1,5};
        Arrays.stream(arr).forEach(e -> System.out.print(Integer.toString(e)+" "));
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(e -> System.out.print(Integer.toString(e)+" "));

    }
}

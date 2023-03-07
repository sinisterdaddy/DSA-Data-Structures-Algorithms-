import java.util.Arrays;

public class CombSort{
    
    private static final float SHRINK_FACTOR = 1.3f;

    public static void combSort(int[] array) {
	
	        if(array == null || array.length < 2) {	      
                      return;
	        }
	
	        int n = array.length;
	        int gap = n;
	        boolean swapped = false;
	
	        do {
	            
	            gap = (int) (gap / SHRINK_FACTOR);
	            for (int i = 0; i < n - gap; i++) {
	                if (array[i] > array[i + gap]) {
	                    swap(array, i, i + gap);
	                    swapped = true;
	                }
	            }
	            
        } while (gap > 1 && swapped);
	    }

    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
        array[j] = temp;        
    }

    public static void main(String args[]) {
	        int[] array = {50, 10, 25, -45, 30, 28};	     
            combSort(array);
	        System.out.println(Arrays.toString(array));

}}
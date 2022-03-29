package Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public Sort() {}
    // selectionSort doest not work and I'm not sure why... please fix!
    public void selectionSort(int[] arr) {     // Sort a[0], ..., a[size-1] in ascending order.
        int i, iMax, n;
        int aTemp;
        for (n = arr.length; n >= 2; n--) {     // Find the index "iMax" of the largest element among a[0], ..., a[n-1]:
            iMax = 0;
            for (i = 1; i < n; i++)
                if (arr[i] > arr[iMax]) {
                    iMax = i;                   // Swap a[iMax] with a[n-1]:
                    aTemp = arr[iMax];          // Save a[iMax] in a temporary location.
                    arr[iMax] = arr[n - 1];     // Copy a[n-1] to a[iMax].
                    arr[n - 1] = aTemp;         // Copy saved value to a[n-1].
                }
                                                // Decrement n (accomplished by n-- in the "for" loop).
        }
    }

    public void insertionSort(int[] arr) {         // Sort a[0], ..., a[size-1] in ascending order.
        int key, position;
        for (int n = 1; n < arr.length; n++) {
            key = arr[n];                           // Save next element to be inserted
            position = n;                           // Go backwards from a[index-1], shift elements to the right until you find an element a[index] <= key
            while (position > 0 && arr[position-1] > key) {
                arr[position] = arr[position-1];
                position--;
            }
            arr[position] = key;                    // Insert the saved element after a[position]
        }                                           // Increment n ( n++ of for loop)
    }

    public Object[] arraySort(int[] importedArray) {
        ArrayList<Integer> unsorted = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();
        for (int i = 0; i < importedArray.length; i++) {
            unsorted.add(importedArray[i]);
        }
        int size = unsorted.size();
        for (int i = 0; i < size; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int j = 0; j < unsorted.size(); j++) {
                if (unsorted.get(j) < min) {
                    min = unsorted.get(j);
                    index = j;
                }
            }
            unsorted.remove(index);
            sorted.add(min);
        }
        return sorted.toArray();
    }

    public static void main(String[] args) {
        int[] testArray = new int[20];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(testArray));
        Sort array = new Sort();
        System.out.println(Arrays.toString(array.arraySort(testArray)));

    }


}

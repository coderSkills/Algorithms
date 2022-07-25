import java.time.LocalDateTime;
import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        int[] unsortedArray = {3,4,5,6,23,45,23,314,78,79,1,40,43};

        System.out.println("################Insertion sort#################");
        InsertionSort insertionSort = new InsertionSort();
        printArray(unsortedArray);
        int[] sortedArray = insertionSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################Selection sort#################");
        SelectionSort selectionSort = new SelectionSort();
        printArray(unsortedArray);
        sortedArray = selectionSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################MergeSort#################");
        MergeSort sort = new MergeSort();
        printArray(unsortedArray);
        sortedArray = sort.sort(unsortedArray);
        printArray(sortedArray);
    }

    // Print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        System.out.println(LocalDateTime.now());
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

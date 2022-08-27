import sort.CountingSort;

import java.time.LocalDateTime;

public class App {
    public static void main(String args[]) {
        int[] unsortedArray = {3,4,5,6,23,45,23,314,78,79,1,40,43};

        System.out.println("################Insertion sort#################");
        sort.InsertionSort insertionSort = new sort.InsertionSort();
        printArray(unsortedArray);
        int[] sortedArray = insertionSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################Selection sort#################");
        sort.SelectionSort selectionSort = new sort.SelectionSort();
        printArray(unsortedArray);
        sortedArray = selectionSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################sort.MergeSort#################");
        sort.MergeSort sort = new sort.MergeSort();
        printArray(unsortedArray);
        sortedArray = sort.sort(unsortedArray);
        printArray(sortedArray);


        System.out.println("################Heap Sort#################");
        sort.HeapSort heapSort = new sort.HeapSort();
        printArray(unsortedArray);
        sortedArray = heapSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################quick Sort#################");
        sort.QuickSort quickSort = new sort.QuickSort();
        printArray(unsortedArray);
        sortedArray = quickSort.sort(unsortedArray);
        printArray(sortedArray);

        System.out.println("################conting Sort#################");
        CountingSort countingSort = new CountingSort();
        printArray(unsortedArray);
        sortedArray = countingSort.sort(unsortedArray);
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

package sort;

public class QuickSort {
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }
    // 1 4 5 3 2 -> 1 2
    public void mergeSort(int[] arr, int startingIndex, int endingIndex) {
        if (startingIndex<endingIndex) {
            int pi = partition(arr, startingIndex, endingIndex);
            mergeSort(arr, startingIndex, pi-1);
            mergeSort(arr, pi+1, endingIndex);
        }
    }

    public int partition(int[] arr, int startingIndex, int endingIndex) {
        //Making last element as pivot element
        int i = startingIndex-1;
        for (int j=startingIndex; j<endingIndex;j++) {
            if (arr[j]<=arr[endingIndex]) {
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        //swap pivot element
        int temp = arr[i+1];
        arr[i+1] = arr[endingIndex];
        arr[endingIndex] = temp;
        return i+1;
    }
}

package sort;

public class HeapSort {
    public int[] sort(int[] arr) {
        buildMaxHeap(arr);
        int n = arr.length;
        for (int i = n-1; i>=0; i-- ) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }
    public void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i=((n/2)-1); i>=0; i--) {
            heapify(arr, n, i);
        }
    }
    public void heapify(int[] arr, int n, int position) {
        int max = position;
        int left = (2*position)+1;
        int right = (2*position)+2;
        if (left < n && arr[max]<arr[left]) {
            max = left;
        }
        if(right < n &&arr[max]<arr[right]) {
            max = right;
        }
        if (max!=position) {
            int temp = arr[position];
            arr[position] = arr[max];
            arr[max] = temp;
            heapify(arr, n, max);
        }

    }
}

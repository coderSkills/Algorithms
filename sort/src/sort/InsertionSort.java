package sort;

import java.time.LocalDateTime;

public class InsertionSort {

    public int[] sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int currentIndex = i;
            while(currentIndex>0) {
                if(arr[currentIndex]<arr[currentIndex-1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex-1];
                    arr[currentIndex-1] = temp;
                }
                currentIndex--;
            }
        }
        return arr;
    }
}

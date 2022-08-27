package sort;

import java.util.Arrays;

public class CountingSort {
    public int[] sort(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        int maxNumber = findMaxNumber(arr);
        countingSort(arr, result, maxNumber);
        return result;
    }
    private void countingSort(int[] arr, int[] result, int maxNumber) {
        int[] countArr = new int[maxNumber+1];

        for (int i: arr) {
            countArr[i]++;
        }
        for (int i=1; i<=maxNumber; i++) {
            countArr[i] = countArr[i]+countArr[i-1];
        }
        for (int i = result.length-1; i>=0; i--) {
            result[countArr[arr[i]]-1] = arr[i];
            countArr[arr[i]]--;
        }

    }
    private int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i : arr){
            max = Math.max(i, max);
        }
        return max;
    }
}

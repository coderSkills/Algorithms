package sort;

public class RadixSort {
    public int[] sort(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
//        int maxNumber = findMaxNumber(arr);
//        radixSort(result, maxNumber);
        return result;
    }
    private void radixSort(int[] arr, int[] result, int digit) {
        int maxNumber = findMaxNumberByDigit(arr, digit);
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
    private int findMaxNumberByDigit(int[] arr, int digit) {
        for (int i=1; i<=digit; i++) {

        }

        int max = 0;
        for (int i : arr){
            max = Math.max(i, max);
        }
        return max;

    }
}

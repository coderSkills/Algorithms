public class MergeSort {
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        return arr;
    }
    public void mergeSort(int[] arr, int leftIndex, int rightIndex) {
    if (leftIndex < rightIndex) {
        int middleIndex = (leftIndex + rightIndex)/2;
        mergeSort(arr, leftIndex, middleIndex);
        mergeSort(arr, middleIndex+1, rightIndex);
        merge(arr, leftIndex, middleIndex, rightIndex);
    }
    }
    public void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
       int[] leftArray = new int[middleIndex-leftIndex+1];
       int[] rightArray = new int[rightIndex-middleIndex];
        for (int i=0; i<leftArray.length; i++) leftArray[i]=arr[leftIndex+i];
        for (int j=0; j<rightArray.length; j++) rightArray[j]=arr[middleIndex+1+j];
        int i=0;
        int j=0;
        int k = leftIndex;
        while(i< leftArray.length && j<rightArray.length ) {
            if (leftArray[i]<=rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}

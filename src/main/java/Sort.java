import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] array){

        boolean swapped = true;

        while (swapped) {

            swapped = false;

            // Loop checks for length - 1 as there's nothing to compare the final value against
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i+1]) {
                    int tempValue = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tempValue;

                    swapped = true;
                }
            }
        }

        System.out.println("Bubble Sort: " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentMinIndex]) {
                    currentMinIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[currentMinIndex];
            array[currentMinIndex] = temp;

        }

        System.out.println("Selection Sort: " + Arrays.toString(array));
    }

    public static int[] mergeSort(int[] array){
        int arrLength = array.length;

        if (arrLength < 2) {
            return new int[0];
        }

        int midIndex = arrLength / 2;
        int[] leftPart = new int[midIndex];
        int[] rightPart = new int[arrLength - midIndex];

        // Populating partitioned arrays with the values in the parameter array
        for (int i = 0; i < midIndex; i++) {
            leftPart[i] = array[i];
        }

        for (int i = midIndex; i < arrLength; i++) {
            // i - midIndex will set the appropriate index
            // otherwise the indexes would be shifted by the midIndex
            // as it wouldn't start at index 0
            rightPart[i - midIndex] = array[i];
        }

        // Recursively calling the method to merge sort partitions
        mergeSort(leftPart);
        mergeSort(rightPart);

        merge(array, leftPart, rightPart);

        return array;
    }

    private static void merge(int[] array, int[] leftPart, int[] rightPart){
        int leftSize = leftPart.length;
        int rightSize = rightPart.length;

        int i = 0 , j = 0,  k = 0;

        // Loop until there are no remaining elements in either array
        while(i < leftSize && j < rightSize){
            if (leftPart[i] <= rightPart[j]) {
                array[k] = leftPart[i];
                i++;
            } else {
                array[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            array[k] = leftPart[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            array[k] = rightPart[j];
            j++;
            k++;
        }
    }

    public static int[] quickSort(int[] array, int lowIndex, int highIndex){
        // Select pivot variable, this is called partitioning
        // Numbers lower than the pivot go to the left of it
        // Numbers higher than the pivot go to the right of it

        // Recursively quick sort values in the left and right partitions
        // around your pivot

        if (lowIndex >= highIndex) {
            return new int[0];
        }

        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swapArrayEl(array, leftPointer, rightPointer);
        }

        swapArrayEl(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

        return array;
    }

    private static void swapArrayEl(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
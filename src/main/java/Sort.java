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

    public static void quickSort(int[] array, int lowIndex, int highIndex){
        // Select pivot variable, this is called partitioning
        // Numbers lower than the pivot go to the left of it
        // Numbers higher than the pivot go to the right of it

        // Recursively quick sort values in the left and right partitions
        // around your pivot

        System.out.println("Quick Sort: " + Arrays.toString(array));
    }
}
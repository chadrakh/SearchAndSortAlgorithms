import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] numbers = {10, 8, 5, 3, 2, 7, 1};

        // Bubble sort
        Sort.bubbleSort(numbers);

        // Selection sort
        Sort.selectionSort(numbers);

        // Merge sort
        System.out.println("Merge Sort: " + Arrays.toString(Sort.mergeSort(numbers)));

        // Quick sort
        System.out.println("Quick Sort: " + Arrays.toString(Sort.quickSort(numbers, 0, numbers.length - 1)));
    }
}

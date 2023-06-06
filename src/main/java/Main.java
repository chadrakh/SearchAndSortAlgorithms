public class Main {
    public static void main(String[] args){

        int[] numbers = {10, 8, 5, 3, 2, 7};

        // Bubble Sort Call
        Sort.bubbleSort(numbers);

        // Quick Sort Call
        Sort.quickSort(numbers, 0, numbers.length - 1);

    }
}

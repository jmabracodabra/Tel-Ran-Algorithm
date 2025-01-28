package lessons.lesson1112;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 9, -2, 5};
        int[] arr2 = {-2, 0, 2, 4, 5, 9};

        System.out.println(Arrays.toString(bubbleSortOpt(arr)));
        System.out.println(Arrays.toString(bubbleSortOpt(arr2)));
    }

    private static int[] bubbleSortOpt(int[] arr) {
        boolean isSorted;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                count++;
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(count);
        return arr;
    }

    private static int[] bubbleSort(int[] arr) {
        boolean isSorted = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                count++;
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(count);
        return arr;
    }
}

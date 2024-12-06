package homework.homework2;

//Напишите метод, который принимает два отсортированных массива и объединяет их
// в один отсортированный массив.
//
//        Пример:
//Ввод: arr1 = {1, 3, 5}, arr2 = {2, 4, 6}
//Вывод: Объединенный массив: {1, 2, 3, 4, 5, 6}

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};

        System.out.println(Arrays.toString(mergeArrs(nums1, nums2)));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        System.out.println(Arrays.toString(mergeArrs(arr1, arr2)));

        int[] nums3 = {2, 4, 6};
        int[] nums4 = {1, 3, 5};

        System.out.println(Arrays.toString(mergeArrs(nums3, nums4)));
    }

    private static int[] mergeArrs(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int first = 0;
        int second = 0;
        int i = 0;

        while (first < arr1.length && second < arr2.length) {
            if (arr1[first] < arr2[second]) {
                result[i++] = arr1[first++];
            } else {
                result[i++] = arr2[second++];
            }
        }

        while (first < arr1.length) {
            result[i++] = arr1[first++];
        }

        while (second < arr2.length) {
            result[i++] = arr2[second++];
        }

        return result;
    }
}

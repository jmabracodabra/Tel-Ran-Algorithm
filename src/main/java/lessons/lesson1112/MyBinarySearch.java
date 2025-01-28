package lessons.lesson1112;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-10, -1, 0, 2, 15, 17, 21, 99, 101};
        int n = 0;
        System.out.println("Numder " + n + " is by index " + elementSearch(arr, n));
    }

    private static int elementSearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (n == arr[mid]) {
                return mid;
            }
            if (n < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

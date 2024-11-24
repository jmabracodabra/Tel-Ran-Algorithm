package homework;

public class Homework1 {

    public static void main(String[] args) {
        int[] arr = {6, 5, 0, 7, -55, 2, 2, 9, 33, -1, 55, 87, 0};
        int[] arr1 = {6, 5, 0, 7, 2, 2, 9, 33, -1, 55, 87, 0};
        int[] arr2 = {7, 2, 5, 3, 9, 1};
        int[] arr3 = {1, 1, 2, 2, 3, 3};

        findThirdMin(arr);
        findThirdMin(arr2);
        findThirdMin(arr3);
        findFourthMin(arr1);
    }

    private static void findThirdMin(int[] arr) {
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        int minThree = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < minOne) {
                minThree = minTwo;
                minTwo = minOne;
                minOne = num;
            } else if (num < minTwo && num != minOne) {
                minThree = minTwo;
                minTwo = num;
            } else if (num < minThree && num != minTwo && num != minOne) {
                minThree = num;
            }
        }
        System.out.println("the third min number is: " + minThree);
    }

    private static void findFourthMin(int[] arr) {
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        int minThree = Integer.MAX_VALUE;
        int minFourth = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < minOne) {
                minFourth = minThree;
                minThree = minTwo;
                minTwo = minOne;
                minOne = num;
            } else if (num < minTwo && num != minOne) {
                minFourth = minThree;
                minThree = minTwo;
                minTwo = num;
            } else if (num < minThree && num != minTwo && num != minOne) {
                minFourth = minThree;
                minThree = num;
            } else if (num < minFourth && num != minThree && num != minTwo && num != minOne) {
                minFourth = num;
            }
        }
        System.out.println("the fourth min number is: " + minThree);
    }
}

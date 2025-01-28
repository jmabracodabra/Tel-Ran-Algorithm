package lessons.lesson0412;

public class RecursiveTwo {

    public static void main(String[] args) {

    }

    private static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

//    private static int powerRecursive(int base, int exponent) {
//
//    }


}

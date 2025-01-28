package lessons.lesson1112;

public class Go {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(way(4, 4));
    }

    public static int way(int n, int m) {
        count++;
        System.out.println("move: " + count);
        if (n < 1 || m < 1) {
            return 0;
        }

        if (n == 1 && m == 1) {
            return 1;
        }

        return way(n - 1, m) + way(n, m - 1);
    }
}

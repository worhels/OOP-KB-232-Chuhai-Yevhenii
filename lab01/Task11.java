import java.util.Scanner;

public class Task11 {

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(sum(array));
    }
}
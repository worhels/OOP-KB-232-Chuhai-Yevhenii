import java.util.Scanner;

public class Task12 {

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];

        result[0] = false;
        result[1] = false;

        for (int i = 2; i < array.length; i++) {
            result[i] = (array[i] == array[i - 1] + array[i - 2]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        boolean[] result = getSumCheckArray(array);

        for (boolean b : result) {
            System.out.print(b + " ");
        }
    }
}
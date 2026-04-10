import java.util.*;

public class Task14 {

    public static void cycleSwap(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        shift = shift % array.length;

        for (int i = 0; i < shift; i++) {
            cycleSwap(array);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int shift = sc.nextInt();

        cycleSwap(array, shift);

        System.out.println(Arrays.toString(array));
    }
}
import java.util.*;

public class Task13 {

    public static int[] removeLocalMaxima(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!isLocalMax(array, i)) {
                list.add(array[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    private static boolean isLocalMax(int[] array, int i) {
        if (i == 0) return array[i] > array[i + 1];
        if (i == array.length - 1) return array[i] > array[i - 1];

        return array[i] > array[i - 1] && array[i] > array[i + 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] result = removeLocalMaxima(array);

        System.out.println(Arrays.toString(result));
    }
}
public class Task10 {

    public static int max(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 4};
        System.out.println(max(array));
    }
}
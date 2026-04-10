import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (number != 0) {
            sum += number;
            count++;
            number = sc.nextInt();
        }

        System.out.println(sum / count);
    }
}
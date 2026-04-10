import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (a >= h) {
            System.out.println(1);
            return;
        }

        if (a <= b) {
            System.out.println("Impossible");
            return;
        }

        int days = (h - b - 1) / (a - b) + 1;

        System.out.println(days);
    }
}
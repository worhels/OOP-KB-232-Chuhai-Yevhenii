import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        int friends = sc.nextInt();

        if (bill < 0) {
            System.out.println("Error");
            return;
        }

        if (friends <= 0) {
            System.out.println("Error");
            return;
        }

        double totalWithTips = bill * 1.10;
        int perFriend = (int) (totalWithTips / friends);

        System.out.println(perFriend);
    }
}
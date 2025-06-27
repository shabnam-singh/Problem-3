import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? a - 1 : a;

        for (int i = 1; i < 2 * a; i += 2) {
            if (i <= 2 * limit - 1) {
                System.out.print(i + " ");
            }
        }
    }
}

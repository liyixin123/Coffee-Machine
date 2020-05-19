import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = scanner.nextInt();
        while (a != 0) {
            sum += a;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                return;
            }
            a = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
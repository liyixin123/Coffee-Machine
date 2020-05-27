import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (target == list[i]) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
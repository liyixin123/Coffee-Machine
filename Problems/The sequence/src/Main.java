import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        int i = 0;
        while (i < n) {
            i++;
            int a = scanner.nextInt();
            if (a % 4 == 0 && a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
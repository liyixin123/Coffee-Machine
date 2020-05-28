import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tripleNum = 0;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = 2; i < n; i++) {
            if (list[i] - list[i - 1] == 1 && list[i - 1] - list[i - 2] == 1) {
                tripleNum++;
            }
        }
        System.out.println(tripleNum);
    }
}
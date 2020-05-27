import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ascendNum = 1;
        int ascendMax = 0;
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (list[i] - list[i - 1] > 0) {
                ascendNum++;
            } else if (ascendNum > ascendMax) {
                ascendMax = ascendNum;
                ascendNum = 1;
            }
        }
        System.out.println(ascendMax > ascendNum ? ascendMax : ascendNum);
    }
}
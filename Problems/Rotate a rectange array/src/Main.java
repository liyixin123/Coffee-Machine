import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] m1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(m1[row - j - 1][i] + " ");
            }
            System.out.println();
        }
    }
}
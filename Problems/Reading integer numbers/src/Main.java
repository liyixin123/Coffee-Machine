import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[4];
        for (int i = 0; i < 4; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(list[i]);
        }
    }
}
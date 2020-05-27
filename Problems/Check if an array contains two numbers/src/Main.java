import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> m = new HashMap<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            m.put(scanner.nextInt(), i);
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (m.containsKey(a) && m.containsKey(b)) {
            if (m.get(a) - m.get(b) == 1) {
                System.out.println(true);
                return;
            } else if (-1 == m.get(a) - m.get(b)) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);

    }
}
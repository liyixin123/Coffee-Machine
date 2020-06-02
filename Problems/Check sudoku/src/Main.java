import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n * n][n * n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        HashMap<Integer, Integer>[] col = new HashMap[n * n];
        HashMap<Integer, Integer>[] box = new HashMap[n * n];
        for (int i = 0; i < n * n; i++) {
            col[i] = new HashMap<>();
            box[i] = new HashMap<>();
        }
        for (int i = 0; i < matrix.length; i++) {
            HashMap<Integer, Integer> line = new HashMap<>();
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                if (val > n * n) {
                    System.out.println("NO");
                    return;
                }
                if (line.containsKey(val)) {
                    System.out.println("NO");
                    return;
                }
                line.put(val, 1);
                if (col[j].containsKey(val)) {
                    System.out.println("NO");
                    return;
                }
                col[j].put(val, 1);
                var box1 = box[(i / n) * n + j / n];
                if (box1.containsKey(val)) {
                    System.out.println("NO");
                    return;
                }
                box1.put(val, 1);
            }
        }
        System.out.println("YES");
    }
}
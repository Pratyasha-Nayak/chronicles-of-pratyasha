import java.util.*;
class CodeChef {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                int M = sc.nextInt();
                if (M < N) {
                    System.out.println(N * 2 - M);
                } else {
                    System.out.println(N);
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

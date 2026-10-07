import java.util.Scanner;
public class Q19_Pascals_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // e.g., 5

        for (int i = 0; i < n; i++) {
            int val = 1; // first value in every row is 1

            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");

                // next value in same row using:
                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}


import java.util.Scanner;

public class Q20_Alphabet_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // e.g., 3

        for (int i = 1; i <= n; i++) {
            // increasing part: A B C ...
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            // decreasing part: ... C B A (start from one step before last)
            ch -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }

        sc.close();
    }
}
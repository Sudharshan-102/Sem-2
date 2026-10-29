import java.util.Scanner;

public class Q56_decimal_to_hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // Test: 79

        if (num == 0) {
            System.out.println("0");
            return;
        }

        StringBuilder hex = new StringBuilder();

        while (num > 0) {
            int rem = num % 16;

            if (rem < 10) {
                hex.append((char)('0' + rem));
            } else {
                hex.append((char)('A' + (rem - 10)));
            }

            num /= 16;
        }

        System.out.println(hex.reverse().toString());
        sc.close();
    }
}
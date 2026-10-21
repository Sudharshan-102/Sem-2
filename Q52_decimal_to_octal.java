import java.util.Scanner;

public class Q52_decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // 79

        if (num == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int rem = num % 8;
            sb.append(rem);
            num /= 8;
        }

        System.out.println(sb.reverse().toString());
        sc.close();
    }
}
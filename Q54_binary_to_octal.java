import java.util.Scanner;

public class Q54_binary_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bin = sc.nextLong();   // 1001

        // binary to decimal
        int decimal = 0;
        int place2 = 1; // 2^0
        while (bin > 0) {
            int digit = (int)(bin % 10);
            decimal += digit * place2;
            place2 *= 2;
            bin /= 10;
        }

        // decimal to octal
        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 8);
            decimal /= 8;
        }

        System.out.println(sb.reverse().toString());
        sc.close();
    }
}
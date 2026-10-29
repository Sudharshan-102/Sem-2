import java.util.Scanner;

public class Q55_octal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();   // example: 11

        // octal to decimal
        int decimal = 0;
        int place8 = 1;
        while (oct > 0) {
            int digit = oct % 10;
            decimal += digit * place8;
            place8 *= 8;
            oct /= 10;
        }

        // decimal to binary
        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(decimal % 2);
            decimal /= 2;
        }

        System.out.println(sb.reverse().toString());
        sc.close();
    }
}
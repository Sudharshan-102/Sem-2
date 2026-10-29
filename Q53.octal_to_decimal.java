import java.util.Scanner;

public class octal_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oct = sc.nextInt();   // 745

        int decimal = 0;
        int place = 1; // 8^0

        while (oct > 0) {
            int digit = oct % 10;       // last octal digit
            decimal += digit * place;   // add digit * 8^pos
            place *= 8;
            oct /= 10;
        }

        System.out.println(decimal);
        sc.close();
    }
}
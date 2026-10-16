import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int decimal = 0;
        int power = 0;
        for (int i = binary; i > 0; i = i / 10) {
            int digit = i % 10;
            decimal += digit * Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal = " + decimal);
    }
}
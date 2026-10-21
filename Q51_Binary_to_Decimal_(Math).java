import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            int digit = binary.charAt(length - 1 - i) - '0';
            decimal += digit * Math.pow(2, i);
        }
        System.out.println("Decimal = " + decimal);
    }
}
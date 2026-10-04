import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no:");
        int num = scanner.nextInt();
        int i=0;
        while(i<=num) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            i++;
            System.out.println();
        }
        scanner.close();
    }
}

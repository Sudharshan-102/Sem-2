import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int num = scanner.nextInt();
            for (int j = 1;j<=num;j++) {
                for (int i = 0; i < 11; i++) {
                    System.out.println(j + " X " + i + " = " + j * i);
                }
                System.out.println("--------------------------");
            }
            scanner.close();
        }
}
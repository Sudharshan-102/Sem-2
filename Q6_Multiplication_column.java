import java.util.Scanner;
//public class Main {
       // public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int j = scanner.nextInt();
            for (int i = 0; i < 11; i++) {
                System.out.println(j+" X "+i+" = "+j*i);
            }
            scanner.close();
        }
}
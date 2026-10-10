import java.util.Scanner;
public class LabQs_48 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1;i<=n;i++){
            System.out.print(Math.pow(i,2) + " ");
            sum = (int) (sum + Math.pow(i,2));
        }
        System.out.println("\n" + sum);

    }
}

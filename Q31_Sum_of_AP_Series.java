//(Qs)31. Sum of A.P. Series
import java.util.Scanner;
public class LabQs_31 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(n/2*(2*a+(n-1)*d));

    }
}

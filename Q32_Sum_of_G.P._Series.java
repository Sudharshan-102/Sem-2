import java.util.Scanner;
public class LabQs_32 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println((a*(Math.pow(d,n)-1))/(d-1));

    }
}
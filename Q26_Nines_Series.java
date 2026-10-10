import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter no : ");
            int num = scanner.nextInt();
            String sum = "0";
            int total_sum=0;
            for (int i = 0;i<=num;i++){
                for (int j=0;j<i;j++){
                    sum+="9";
                }
                int n = Integer.parseInt(sum);
                total_sum+=n;
                sum="";
            }
            System.out.println("The sum is: "+total_sum);
        }

}
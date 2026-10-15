import java.util.Scanner;
public class LabQs_25 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        for (int i = 0;i<num.length();i++){
            int fact = 1;
            for (int j = 1;j<=num.charAt(i)-'0';j++){
                fact = fact * j;
            }
            sum = sum + fact;
        }
        System.out.println(sum);
        if (sum == Integer.parseInt(num)){
            System.out.println("STRONG");
        }
        else{
            System.out.println("NOT STRONG");
        }


    }
}

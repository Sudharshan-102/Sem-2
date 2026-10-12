import java.util.Scanner;
public class LabQs_48 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int j = 0; j < num; j++) {
            double sum = 0;
            for (int i = 0; i < ("" + j).length(); i++) {
                sum = (sum + Math.pow(Integer.parseInt(String.valueOf(("" + j).charAt(i))), ("" + j).length()));
            }
            if (sum == j) {
                System.out.println(j);
            }
        }
    }
}

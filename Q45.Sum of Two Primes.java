import java.util.Scanner;
public class LabQs_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int arr[] = new int[num];
        int c = 0;
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }

            }
            if (flag) {
                arr[c] = i;
                c = c + 1;
                }
                }
        for (int i = 0;i<c;i++){
            for (int j = 0;j<c;j++){
                if (arr[i] + arr[j] == num){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }

            }
        }









import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = scanner.nextLine();
        int len = str.length() -1;
        for(int i=len;i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 ||
                String.valueOf(i).contains("3") ||
                String.valueOf(i).contains("6") ||
                String.valueOf(i).contains("9")) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
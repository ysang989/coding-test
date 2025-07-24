import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n ; i++) {
            for (int j = n-i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {  // 수정: 별을 i+1개 출력
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

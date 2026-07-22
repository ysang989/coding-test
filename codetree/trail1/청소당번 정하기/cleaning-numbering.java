import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i = 1; i <= a; i++) {
            if (i % 12 == 0) {
                count3++;
            } else if (i % 3 == 0) {
                count2++;
            } else if (i % 2 == 0) {
                count1++;
            }
        }

        System.out.print(count1 + " " + count2 + " " + count3);
    }
}
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BigDecimal result = BigDecimal.valueOf(n)
                .divide(BigDecimal.valueOf(m), 20, RoundingMode.DOWN);

        System.out.print(result);
    }
}
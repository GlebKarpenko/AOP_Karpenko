import java.lang.Math;
import java.util.Scanner;

public class Cycle {
    public void solve() {
        Scanner in = new Scanner(System.in);
        Lab_1 main = new Lab_1();

        System.out.println("Введіть n (n - натуральне число).");
        int n = 1;
        n = in.nextInt();
        double sum = 0;

        for (int k = 1; k <= n; k++) {

            double formula = ((double) Math.pow(-1, k))/ ((double) Math.pow(k, 2) * (k + 1));;
            sum = sum + formula;
        }
        System.out.println("Сума: " + sum);

        main.menu();
    }
}

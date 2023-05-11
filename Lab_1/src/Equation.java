import java.lang.Math;
import java.util.Scanner;

public class Equation {
    public static void solve() {
        Scanner in = new Scanner(System.in);
        Lab_1 main = new Lab_1();
        double a, b, x;
        System.out.println("Рівняння виду ax + b = 0");
        System.out.println("Введіть сталу a: ");
        a = in.nextDouble();
        System.out.println("Введіть сталу b: ");
        b = in.nextDouble();

        if (a == 0 && b != 0) {
            NO_sol();
        }

        if (a == 0 && b == 0) {
            INF_sol();
        }

        if (a != 0 && b == 0) {
            x = 0;
            IS_sol(x);
        }

        if (a != 0 && b != 0) {
            x = -b / a;
            IS_sol(x);
        }

        main.menu();
    }

    public static void IS_sol(double solution) {
        System.out.println("Корінь рівняння: " + solution);
    }

    public static void INF_sol() {
        System.out.println("Рівняння має безліч розв'яків.");
    }

    public static void NO_sol() {
        System.out.println("Рівняння не має коренів.");
    }
}

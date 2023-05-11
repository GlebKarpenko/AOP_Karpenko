import java.util.Scanner;
import java.lang.Math;

public class Method {

    public static void solve(){
        Scanner in = new Scanner(System.in);
        Lab_1 main = new Lab_1();
        System.out.println("Таблиця значень x та y.");
        System.out.println("    ");
        double x = 0, y;

        for (int i = 0; i < 14; i++){

            x = x + 0.5;
            y = x - ((double) Math.pow(x, 3) / 3) + ((double) Math.pow(x, 5) / 5);
            System.out.println("   x: " + x + "  y: " + y);
        }

        main.menu();
    }
}

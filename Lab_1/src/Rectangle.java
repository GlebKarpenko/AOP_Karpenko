import java.lang.Math;
import java.util.Scanner;

public class Rectangle {
    public static  void solve(){

        Scanner in = new Scanner(System.in);
        Lab_1 main = new Lab_1();
        System.out.println("Введіть ширину та довжину прямокутника: ");

        double width, length, area, perimeter, diagonal;
        width = in.nextDouble();
        length =  in.nextDouble();

        perimeter = (width * 2) + (length * 2);
        area = width * length;
        diagonal = (double) Math.pow((width * width + length * length), 0.5);

        System.out.println("Периметр прямокутника: " + perimeter);
        System.out.println("Площа прямокутника: " + area);
        System.out.println("Діагональ прмокутника: " + diagonal);

        main.menu();
    }
}

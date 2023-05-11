import javax.swing.undo.CannotUndoException;
import java.util.Scanner;
import java.lang.Math;

public class Lab_1 {

    public static void main(String [] args) {

        menu();
    }

    public  static void menu() {

        Rectangle rect1 = new Rectangle();
        Equation equation1 = new Equation();
        Cycle cycle1 = new Cycle();
        Array array1 = new Array();
        Method method1 = new Method();

        Scanner in = new Scanner(System.in);
        System.out.println("    #####МЕНЮ ПРОГРАМИ#####");
        System.out.println("        Оберіть дію:");
        System.out.println("1.Обчислити плоцу, периметр та діагоналі прямокутника.");
        System.out.println("2.Знайти корені рівняння ax + b = 0");
        System.out.println("3.Обчичлити суму послідовності.");
        System.out.println("4.Робота з масивом.");
        System.out.println("5.Обчислення значення функції.");
        System.out.println("0.Завершити роботу.");
        int choice = 0;
        choice = in.nextInt();

        switch (choice) {
            case 1 : rect1.solve();
            case 2 : equation1.solve();
            case 3 : cycle1.solve();
            case 4 : array1.solve();
            case 5 : method1.solve();
        }
    }
}
import java.util.Scanner;

public class Lab_2 {

    public static void main(String[] args) {

        double[][] Arr = new double[2][3];
        menu(Arr);
    }

    public static void menu(double[][] Arr) {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("Програма для множення на число матриці2x3, транспонування та її додавання до іншої матриці.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("1. Створити нову матрицю.");
        System.out.println("2. Помножити матрицю на число.");
        System.out.println("3. Додати дві матриці.");
        System.out.println("4. Транспонувати матрицю.");
        System.out.println("0. Завершити роботу програми.");

        choice = in.nextInt();

        Matrix2x3 matrix2x3 = new Matrix2x3(Arr);

        switch (choice) {

            case 0:
                System.out.println("Роботу завершено."); break;

            case 1:
                create(); break;

            case 2 :
                matrix2x3.multiply(Arr); break;

            case 3:
                matrix2x3.add(); break;

            case 4 :
                matrix2x3.transpose(); break;
        }
    }

    public static void create() {

        double[][] Arr = new double[2][3];

        System.out.println("Введіть елементи першої матриці.");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                Arr[i][j] = in.nextDouble();

            }
        }

        Matrix2x3 matrix2x3 = new Matrix2x3(Arr);
        matrix2x3.show();
        menu(Arr);

    }
}

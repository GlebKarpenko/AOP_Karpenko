import java.util.Scanner;
import javax.sql.rowset.serial.SerialArray;
import java.lang.Math;

public class Matrix2x3 {

    private double[][] Arr = new double[2][3];

    Matrix2x3(double[][] Arr) {
        this.Arr = Arr;
    }

    void show(){

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Arr[i][j] + "   ");
            }
            System.out.println();
        }

        Lab_2 lab = new Lab_2();
        lab.menu(Arr);

    }

    void multiply(double[][] Arr){

        System.out.println("Введіть коефіцієнт множення матриці.");
        Scanner in = new Scanner(System.in);

        double k = in.nextDouble();

        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){

                Arr[i][j] = Arr[i][j] * k;
            }
        }

        finish();
    }

    void add(){

        Scanner in = new Scanner(System.in);
        double a = 0;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                int order1 = i + 1, order2 = j + 1;
                String o = order1 + "." + order2;
                System.out.println("Введіть доданок до " + o + " елементу матриці.");
                a = in.nextDouble();
                Arr[i][j] = Arr[i][j] + a;
            }
        }
        finish();
    }

    void transpose(){

        double[][] tArr = new double[3][2];
        for (int j = 0; j < 3; j++){
            for (int i = 0; i < 2; i++){

            tArr[j][i] = Arr[i][j];
            System.out.print(tArr[j][i] + "   ");
            }
            System.out.println();
        }

        Lab_2 lab = new Lab_2();
        lab.menu(Arr);
    }

    void finish(){

        Scanner in = new Scanner(System.in);
        System.out.println("Натисніть 1, щоб виввести змінений масив.");
        System.out.println("Натисніть 0 щоб повернутися в меню.");

        int choice = in.nextInt();

        if (choice == 1){show();}

        if (choice == 0){
            Lab_2 lab = new Lab_2();
            lab.menu(Arr);
        }
    }
}

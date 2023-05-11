import javax.sql.rowset.serial.SerialArray;
import java.util.Scanner;
import java.lang.Math;

public class Array {
    public void solve() {
        Scanner in = new Scanner(System.in);
        Lab_1 main = new Lab_1();

        double[] array;
        array = new double[16];
        double[] arrSt;
        arrSt = new double[8];

        System.out.println("Віедіть елементи масиву від a1 до a16.");
        for (int i = 0; i < 16; i++){
            int order = i + 1;
            System.out.println(order + "-й елемент");
            array[i] = in.nextDouble();
        }

        for (int i = 0; i < 8; i++){
            arrSt[i] = array[i] - array[i + 8];
            System.out.println(arrSt[i] + ", ");
        }

        double min;
        if (arrSt[0] < arrSt[1]){
            min = arrSt[0];
        }

        else {
            min = arrSt[1];
        }

        for (int i = 0; i < 8; i++){

            if (arrSt[i] < min){
                min = arrSt[i];
            }
        }

        System.out.println("Мінімальна різниця елементів: " + min);

        main.menu();
    }
}

import java.lang.Math;

public class Lab_7 {

    public double findPerimeter(double a, double b, double c){

        double P = a + b + c;
        return P;
    }

    public double findArea(double a, double b, double c){

        double p = findPerimeter(a, b, c)/2;
        double Area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return Area;
    }

    public int checkInput(double a, double b, double c){

        if (a <= 0 || b <= 0 || c <= 0){
            return -1;
        }
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){

        Lab_7 main = new Lab_7();
        InputForm form1 = new InputForm();
    }
}

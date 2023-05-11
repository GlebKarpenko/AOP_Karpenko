import java.util.Scanner;

abstract class Machine implements Run {
    public String name;
    public double InstSpeed;
    public int weight;
    public final int passengersMin = 0;
    public final int passengersMax = 960;
    public int N_of_Engines;
    public final double maxSpeed = 1000;
    public final double minSpeed = 0;

    Machine (){

    }
    Machine(String name, double speed){
        this.name = name;
        this.InstSpeed = speed;
    }

    public abstract void setData();

    public void getName() {
        System.out.println("Name is: " + this.name);
    }

    public void getInstSpeed() {
        System.out.println("Speed is: " + this.InstSpeed);
    }

    public void getMaxSpeed(){
        System.out.println("Max speed is: " + this.maxSpeed);
    }

    public void getWeight() {
        System.out.println("Weight is: " + this.weight);
    }

    public void getPassengers() {
        System.out.println("The maximum number of passengers is: " + this.passengersMax);
    }

    public void getN_of_Engines() {
        System.out.println("The number of engines is: " + this.N_of_Engines);
    }

    public void getMinSpeed(){
        System.out.println("min speed is: " + this.minSpeed);
    }
}

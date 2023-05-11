public class PassengerAircraft extends Aircraft{

    public void setData(){

        weight = 40000;
        N_of_Engines = 6;
    }

    PassengerAircraft(String name, double speed){
        this.InstSpeed = speed;
        this.name = name;
    }
}

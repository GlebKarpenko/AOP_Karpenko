public class TransportAircraft extends Aircraft{

    public void setData(){

        weight = 50000;
        N_of_Engines = 8;
    }

    TransportAircraft(String name, double speed){
        this.InstSpeed = speed;
        this.name = name;
    }
}

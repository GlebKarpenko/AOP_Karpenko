public class Lab_03 {

    public static void main(String[] args){

        String name1 = "Ан-225 'Мрія'";
        String name2 = "Airbus A-380";
        double speed1 = 903;
        double speed2 = 800;

        TransportAircraft transportAircraft = new TransportAircraft(name1,speed1);
        PassengerAircraft passengerAircraft = new PassengerAircraft(name2, speed2);
        transportAircraft.setData();
        passengerAircraft.setData();

        transportAircraft.getName();
        transportAircraft.getInstSpeed();
        transportAircraft.getMaxSpeed();
        transportAircraft.getWeight();
        transportAircraft.getPassengers();
        transportAircraft.getN_of_Engines();

        System.out.println("");

        passengerAircraft.getName();
        passengerAircraft.getInstSpeed();
        passengerAircraft.getMaxSpeed();
        passengerAircraft.getWeight();
        passengerAircraft.getPassengers();
        passengerAircraft.getN_of_Engines();
    }
}

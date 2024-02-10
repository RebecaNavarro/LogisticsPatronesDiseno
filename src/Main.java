public class Main {

    public static void main(String[] args) {

        System.out.println("Logistica UPB");

        SeaLogistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();

        RoadLogistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        AirLogistics airLogistics = new AirLogistics();
        airLogistics.planDelivery();
    }
}
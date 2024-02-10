public class AirLogistics extends Logistics{

    protected Transport createTransport() {
        return new Airplane();
    }

}

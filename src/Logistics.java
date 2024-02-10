public abstract class Logistics {

    public void planDelivery(){
        Transport transport = this.createTransport();
        transport.deliver();
    }

    //método creador
    protected abstract Transport createTransport();
}

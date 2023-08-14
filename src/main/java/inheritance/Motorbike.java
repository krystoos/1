package inheritance;

public class Motorbike extends Vehicle {
    String Destiny;
    //sporty,tourist,enduro,chopper


    public String getDestiny() {
        return Destiny;
    }

    public Motorbike(String manufacturer, int productionYear, int price, int numWheels, int numSeats, String destiny) {
        super(manufacturer, productionYear, price, numWheels, numSeats);
        Destiny = "unknown";
    }
}

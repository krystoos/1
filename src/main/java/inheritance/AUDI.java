package inheritance;

public class AUDI extends Car{

    String kindOfAUDIDrive;

    public String getKindOfAUDIDrive() {
        return kindOfAUDIDrive;
    }

    public AUDI(String manufacturer, int productionYear, int price, int numWheels, int numSeats, String name, String carBody, String kindOfAUDIDrive) {
        super(manufacturer, productionYear, price, numWheels, numSeats, name, carBody);

        kindOfAUDIDrive = "unknown";
    }
}

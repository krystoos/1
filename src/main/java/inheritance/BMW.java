package inheritance;

public class BMW extends Car {

    String kindOfBMWDrive;

    public String getKindOfBMWDrive() {
        return kindOfBMWDrive;
    }

    public BMW(String manufacturer, int productionYear, int price, int numWheels, int numSeats, String name, String carBody, String kindOfBMWDrive) {
        super(manufacturer, productionYear, price, numWheels, numSeats, name, carBody);
        kindOfBMWDrive = "unknown";
    }
}

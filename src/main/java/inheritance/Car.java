package inheritance;

public class Car extends Vehicle {

    String name;
    String carBody;

    public String getName() {
        return name;
    }

    public String getCarBody() {
        return carBody;
    }

    public Car(String manufacturer, int productionYear, int price, int numWheels, int numSeats, String name, String carBody) {
        super(manufacturer, productionYear, price, numWheels, numSeats);
        name = "name";
        carBody = "carBody";
    }

}


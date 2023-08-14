package inheritance;

public class Plane extends Vehicle{
    String typeOfPlane;
    //singeEngine or multiEngine

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public Plane(String manufacturer, int productionYear, int price, int numWheels, int numSeats, String typeOfPlane) {
        super(manufacturer, productionYear, price, numWheels, numSeats);
       typeOfPlane = "unknown";
    }

}

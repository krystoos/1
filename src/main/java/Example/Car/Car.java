package Example.Car;

public class Car {
    String model;
    String brand;
    String color;
    String note;
    int year;

    public Car( String brand,String model, String color, String note, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.note = note;
        this.year=year;

    }
 public String getColor(){
        return this.color;
 }
    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public String getNote() {
        return note;
    }

    public int getYear() {
        return year;
    }

    public void printInfo(){
        System.out.println("Marka:" + this.brand + " "  + "Model:" + this.model  + " " +
                "Kolor:" + this.color + "Note:" + this.note + " " + "LataProdukcji:" + this.year);
    }
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car1 = carFactory.buildCar();
        Car car2 = carFactory.buildCar();
        car1.printInfo();
        car2.printInfo();
    }
}

package WypozyczalniaAut;

import java.util.ArrayList;

public class Cars {
    public String brand;
    public String model;
    public String carBody;
    public String color;
    public int year;
    public int kilometers;
    public int price;
    public float engine;
    public String paliwo;
    public int HP;
    public String gearbox;
    public String steeringWheel; //leftOrRight
    public Cars(String brand, String model, String carBody, String color,
                int year, int kilometers, int price, float engine, String paliwo, int HP, String gearbox, String steeringWheel) {
        this.brand = brand;
        this.model = model;
        this.carBody = carBody;
        this.color = color;
        this.year = year;
        this.kilometers = kilometers;
        this.price = price;
        this.engine = engine;
        this.paliwo = paliwo;
        this.HP = HP;
        this.gearbox = gearbox;
        this.steeringWheel = steeringWheel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getKilometers() {
        return kilometers;
    }

    public int getPrice() {
        return price;
    }

    public float getEngine() {
        return engine;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public int getHP() {
        return HP;
    }

    public String getGearbox() {
        return gearbox;
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carBody='" + carBody + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", kilometers=" + kilometers +
                ", price=" + price +
                ", engine=" + engine +
                ", paliwo='" + paliwo + '\'' +
                ", HP=" + HP +
                ", gearbox='" + gearbox + '\'' +
                ", steeringWheel='" + steeringWheel + '\'' +
                '}';
    }
    public Cars() {
    }


    }












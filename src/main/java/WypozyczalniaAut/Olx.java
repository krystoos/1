package WypozyczalniaAut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class Olx extends Cars {
    public static void main(String[] args) {

        ArrayList<Cars> BMW = new ArrayList<>();
        BMW.add(new Cars("BMW", "e90", "Sedan", "Gray", 2007, 326000,
                30000, 2.0f, "diesel", 177, "Manual", "Left"));
        BMW.add(new Cars("BMW", "e91", "Kombi", "Black", 2008, 300000,
                33000, 3.0f, "diesel", 210, "Automat", "Left"));
        BMW.add(new Cars("BMW", "e60", "Sedan", "White", 2009, 280000,
                38000, 3.0f, "diesel", 225, "Manual", "Left"));
        BMW.add(new Cars("BMW", "e46", "Sedan", "Black", 2004, 400000,
                18000, 2.0f, "benzin", 180, "Automat", "Right"));
        BMW.add(new Cars("BMW", "M3", "Sedan", "White", 2016, 110000,
                180000, 3.0f, "diesel", 320, "Automat", "Left"));


        ArrayList<Cars> AUDI = new ArrayList<>();
        AUDI.add(new Cars("AUDI", "A3", "Hatchback", "Silver", 2006, 180000,
                15000, 2.0f, "diesel", 140, "Automat", "Left"));
        AUDI.add(new Cars("AUDI", "A5", "Sedan", "Black", 2011, 220000,
                45000, 3.0f, "diesel", 220, "Automat", "Left"));
        AUDI.add(new Cars("AUDI", "A6", "Kombi", "Black", 2007, 280000,
                28000, 1.8f, "benzin", 180, "Manual", "Right"));
        AUDI.add(new Cars("AUDI", "A4", "Sedan", "Black", 2004, 400000,
                18000, 2.0f, "benzin", 180, "Automat", "Right"));
        AUDI.add(new Cars("AUDI", "A4B6", "Sedan", "Black", 204, 400000,
                8000, 1.8f, "benzin", 110, "Manual", "Left"));

        try {

            System.out.println("Wpisz indeks marki którą jesteś zainteresowany:" + "\n" + "-AUDI (1)" + "\n" + "-BMW (2)");
            Scanner scanner = new Scanner(System.in);
            int brandIndex = scanner.nextInt();
            ;
            System.out.println("Wpisz cenę minimalną:");
            int MinCena = scanner.nextInt();
            System.out.println("Wpisz cenę maksymalną:");
            int MaxCena = scanner.nextInt();
            System.out.println("Wpisz rodzaj paliwa:" + "\n" + "(benzin/diesel)");
            String Paliwko = scanner.next();
            System.out.println("Wpisz minimalną moc pojazdu:");
            int MinHP= scanner.nextInt();
            if(brandIndex==1){
            List<Cars> list = AUDI.stream()
                    .filter(car -> car.getPrice() < MaxCena)
                    .filter(car -> car.getPrice() > MinCena)
                    .filter(car -> car.getPaliwo().equalsIgnoreCase(Paliwko))
                    .filter(cars -> cars.getHP()>MinHP)// Ignorowanie wielkości liter
                    .collect(Collectors.toList());
                for (Cars car : list) {
                    System.out.println(car);
                }
            } else{
        List<Cars> list1 = BMW.stream()
                .filter(car -> car.getPrice() < MaxCena)
                .filter(car -> car.getPrice() > MinCena)
                .filter(car -> car.getPaliwo().equalsIgnoreCase(Paliwko))
                .filter(cars -> cars.getHP()>MinHP)// Ignorowanie wielkości liter
                .collect(Collectors.toList());
                for (Cars car : list1) {
                    System.out.println(car);
                }
            }
            scanner.close();
                }catch(Exception e ){

                }

            }

        }


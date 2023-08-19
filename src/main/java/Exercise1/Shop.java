package Exercise1;

import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        try {
        double MonthlyPayment;

            System.out.println("Cena towaru:");
            Scanner scanner = new Scanner(System.in);
            float cenaTowaru = scanner.nextFloat();
            if (cenaTowaru < 100.00 || cenaTowaru > 10000) {
                System.out.println("zła cena");
            } else
                System.out.println("Cena towaru: " + cenaTowaru);

            System.out.println("Jaką liczbę rat chcesz wybrać? (6-48):");
            Scanner scanner1 = new Scanner(System.in);
            int liczbaRat = scanner.nextInt();
            if (liczbaRat <= 12) {
                double loan = 0.025;
                MonthlyPayment=cenaTowaru+(cenaTowaru*loan);
                System.out.println("Kredyt jest oprocentowany na: " + loan + " W " + liczbaRat + " ratach");
                System.out.println("Rata twojego kredytu wynosi: " + MonthlyPayment);
            } else if (liczbaRat > 12 && liczbaRat <= 24) {
                double loan = 0.05;
                MonthlyPayment=cenaTowaru+(cenaTowaru*loan);
                System.out.println("Kredyt jest oprocentowany na: " + loan + " W " + liczbaRat + " ratach");
                System.out.println("Rata twojego kredytu wynosi: " + MonthlyPayment);
            } else if (liczbaRat > 25 && liczbaRat <= 48) {
                double loan = 0.1;
                MonthlyPayment=cenaTowaru+(cenaTowaru*loan);
                System.out.println("Kredyt jest oprocentowany na: " + loan + " W " + liczbaRat + " ratach");
                System.out.println("Rata twojego kredytu wynosi: " + MonthlyPayment);
            } else System.out.println("Niepoprawna liczba");
            scanner.close();
            scanner1.close();
        }catch (Exception e ){
        }
    }
}
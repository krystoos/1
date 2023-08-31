package Walutomat;
import Exercise1.Account;

import java.util.Scanner;

public class WalutomatEx extends Calculator {
    public static void main(String[] args) {
        try {
            System.out.println("Wprowadź ilość NOK, a następnie kurs po jakim je sprzedajesz : ");
            Calculator calculator = new Calculator();
            Scanner scanner = new Scanner(System.in);
            float waluta1 = scanner.nextFloat();
            Scanner scanner1 = new Scanner(System.in);
            float kurs = scanner1.nextFloat();
            calculator.kwotaPoProwizji(waluta1);
            calculator.kwotaPoKursie(kurs);
            calculator.kwotaPierwsza(waluta1);
            System.out.println("Kwota jaką otrzymałeś po przewalutowaniu to: " +calculator.getBalance() + " pln");
            System.out.println("Kurs za jaki musisz minimalnie  przelać otrzymaną kwotę aby wyjść na 0 to: " + calculator.getKursPotrzebnyDoZostaniaNa0());
            System.out.println("Kursy korzystniejsze i odpowiednia do nich kwota jaką będziesz do przodu:");
            calculator.getBetterKurs(waluta1);
            scanner.close();
            scanner1.close();
        } catch (Exception ignored) {
        }
    }
}


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
            calculator.kwotaPoProwizji(waluta1);
            calculator.kwotaPierwsza(waluta1);
            Scanner scanner1 = new Scanner(System.in);
            float kurs = scanner1.nextFloat();
            calculator.kwotaPoKursie(kurs);
            System.out.println("Kwota jaką otrzymałeś po przewalutowaniu to: " +calculator.getBalance());
            System.out.println("Kurs za jaki musisz minimalnie  przelać otrzymaną kwotę aby wyjść na 0 to: " + calculator.getKursPotrzebnyDoZostaniaNa0());
            scanner.close();
            scanner1.close();
        } catch (Exception ignored) {
        }
    }
}


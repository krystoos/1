package Exercise1;

import java.util.Scanner;

public class exc {
    public static void main(String[] args) {
        try {
            System.out.println("Program wyświetla wszystkie potęgi liczby 2, nie wieksze niż podana liczba");
            System.out.println("Podaj liczbę");
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            int potega = 2;
            while (potega <= liczba) {
                System.out.println(potega);
                potega *= 2;
            }
        }catch (Exception e ){
        }
    }
}

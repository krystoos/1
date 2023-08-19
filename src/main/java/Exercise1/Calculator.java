package Exercise1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try {


            System.out.println("Program realizuje funkcje prostego kalkulatora pozwalającego na " + "\n" + "dodawanie(+)," +
                    "odejmowanie(-),mnożenie(*) oraz dzielenie(/) 2 liczb rzeczywistych: ");


            int wynik;
            Scanner scanner1 = new Scanner(System.in);
            int liczba1 = scanner1.nextInt();
            Scanner scanner2 = new Scanner(System.in);
            char symbol = scanner2.next().charAt(0);
            Scanner scanner3 = new Scanner(System.in);
            int liczba2 = scanner3.nextInt();
            switch (symbol) {
                case '+':
                    wynik=liczba1 + liczba2;
                    System.out.println(liczba1 + "+" + liczba2 + "=" +  wynik);
                    break;
                case '-':
                    wynik=liczba1 - liczba2;
                    System.out.println(wynik);
                    System.out.println(liczba1 + "-" + liczba2 + "=" +  wynik);
                    break;
                case '*':
                    wynik=liczba1 * liczba2;
                    System.out.println(wynik);
                    System.out.println(liczba1 + "*" + liczba2 + "=" +  wynik);
                    break;
                case '/':
                    wynik=liczba1 / liczba2;
                    System.out.println(wynik);
                    System.out.println(liczba1 + "/" + liczba2 + "=" +  wynik);
                    break;
                default:
                    System.out.println("Podałeś niewłaściwy znak, spróbuj ponownie");

            }

            scanner1.close();
            scanner2.close();
            scanner3.close();
        }catch (Exception e){

        }
    }
}

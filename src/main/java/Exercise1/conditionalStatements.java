package Exercise1;

import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        System.out.println("\n" + "Program pobiera liczbę całkowitą dodatnią, \n" +
                "a następnie wypisuje wszystkie liczby całkowite niepatrzyste mniejsze od podanej liczby");
        System.out.println("Wprowadź liczbę:");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();
        int i;
        for (i=1; i<podanaLiczba; i+=2) {
            System.out.println(i+" ");
        }
    }
}
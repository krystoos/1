package Exercise1;

import java.util.Scanner;

public class BMIChallange {
    public static void main(String[] args) {

        try {

            System.out.println("Wpisz wagę: ");
            Scanner scanner1 = new Scanner(System.in);
            float YourWeight = scanner1.nextFloat();
            System.out.println("Wpisz wzrost: ");
            Scanner scanner2 = new Scanner(System.in);
            float YourHeight = scanner2.nextFloat();
            scanner1.close();
            scanner2.close();
            System.out.println("Twoja waga: " + YourWeight);
            System.out.println("Twoj wzrost: " + YourHeight);
            float BMI = YourWeight / (YourHeight * YourHeight);
            System.out.println("Twoje BMI: " + BMI);
            if (BMI > 15.5 && BMI < 24.9) {
                System.out.println("Waga prawidłowa");
            } else if (BMI < 15.5) {
                System.out.println("Niedowaga");
            } else System.out.println("Nadwaga");
        }catch (Exception e) {
        }
    }
}

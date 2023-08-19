package Exercise1;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        int divisibleBy3Count = 0;
        int dodatnie=0;

        System.out.println("Enter numbers (enter 150 to stop):");

        do {
            number = scanner.nextInt();
            if (number != 150) {
                sum += number;
                count++;
                if (number > 0 && number % 3 == 0) {
                    divisibleBy3Count++;
                }
               if (number>0){
                   dodatnie++;
               }
            }
        } while (number != 150);

        double average = (double) sum / count;


        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Positive numbers divisible by 3: " + divisibleBy3Count);
        System.out.println("Ilość liczb dodatnich: " + dodatnie);
    }
}
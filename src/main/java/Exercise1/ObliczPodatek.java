package Exercise1;

import java.util.Scanner;

public class ObliczPodatek {
    public static void main(String[] args) {

        System.out.println("Wprowadź swój dochód roczny:");
        Scanner scanner = new Scanner(System.in);
        double TwojDochod = scanner.nextDouble();
        scanner.close();
        System.out.println("Twój dochód roczny to: " + TwojDochod);
        if(TwojDochod<=85528){
            double podatek = (TwojDochod*0.18)-556.02;
            System.out.println("Kwota jaką musisz odprowadzić to: " + podatek);
        }else{
            double podatek = 14839+((TwojDochod-85528)*0.32);
            System.out.println("Kwota jaką musisz odprowadzić to: " + podatek);
        }




    }
}

package Exercise1;
import java. util.Collections;
import java.util.*;


public class Zadania {

    public static void main(String[] args) {


        float stopnieCelcjusza = 23;
        float checkFahrenheit = (float) ((stopnieCelcjusza * 1.8) + 32);
        System.out.println(stopnieCelcjusza + " Stopnie celcjusza to w przeliczeniu: " + checkFahrenheit + " stopni fahrenheita");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + "Wpisz 3 liczby całkowite:");
        Integer number1 = scanner.nextInt();
        Integer number2= scanner.nextInt();
        Integer number3 = scanner.nextInt();
        scanner.close();
        System.out.println("Podane liczby od użytkownika to: " + number1 + " " +  number2 + " " + number3);

        final ArrayList<Integer>liczby=new ArrayList<>(Arrays.asList(number3,number2,number1));
        Collections.sort(liczby);

        System.out.println("Posortowane liczby od najmniejszej do największej: " + liczby);

    }
}

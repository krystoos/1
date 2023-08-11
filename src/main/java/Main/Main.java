package Main;

import java.lang.ref.SoftReference;

public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "hau");
        Dog scruffy = new Dog("scruffy", "wrr");
        Dog bruno = new Dog("bruno","wrr");



        System.out.println(spot.getName() + " " + spot.dajGlos() + " " + "\n" +
                scruffy.getName() + " "  + scruffy.dajGlos() + " ");

        System.out.print(scruffy==bruno);
        System.out.println("\n" + bruno.equals(scruffy));







    }
}

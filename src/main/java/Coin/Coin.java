package Coin;

import java.util.LinkedList;
import java.util.Random;

public class Coin {
    public static void main(String[] args) {

        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println("a : " + a);

        Random random = new Random();
        int b = rand.nextInt(100);
        System.out.println("b : " + b);

        if(a>b){
            System.out.println("a jest wieksze od b");
        } else if (a<b) {
            System.out.println("a jest mniejsze od b");

        }else System.out.println("a jest równe b");
    }
}


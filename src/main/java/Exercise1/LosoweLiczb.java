package Exercise1;

import java.util.LinkedList;
import java.util.Random;

public class LosoweLiczb {
    public static void main(String[] args) {
        int i = 0;
        LinkedList a = new LinkedList<>();
        Random generator = new Random();
            for (i = 0; i > -150 && i < 150; i++) {
                a.add(generator.nextInt());
                System.out.println(a);
                if(i == 0){
                    break;
                }
            }
    }
}
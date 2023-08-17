package Objects;

public class Rectangle {
    public static void main(String[] args) {


        double lenght = 3;
        double width = 4;
        double circuit = (lenght + width) * 2;
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(lenght, 2));

        System.out.println("lenght: " + lenght);
        System.out.println("width: " + width);
        System.out.println("circuit: " + circuit);
        System.out.println("diagonal: " + diagonal + "\n");

        String[]numbersOfAlphabet = new String[5];
        numbersOfAlphabet[0]="a";
        numbersOfAlphabet[1]="b";
        numbersOfAlphabet[2]="c";
        numbersOfAlphabet[3]="d";
        numbersOfAlphabet[4]="e";
        for(int i=0;i<numbersOfAlphabet.length;i++){

            System.out.println(numbersOfAlphabet[i]);
        }

    }
}
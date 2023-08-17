package Objects;

public class Boards {
    public static void main(String[] args) {
        int[] numbers = new int[]{997, 998, 300};
        for (int i = 2; i < numbers.length; i--) {
            if (i == -1) break;
            System.out.println(numbers[i]);


            if(numbers[0]>numbers[1]&&numbers[0]>numbers[2]){
                System.out.println("Największa liczba w tej tablicy to : " + numbers[0]);
            } else if (numbers[1]>numbers[0]&&numbers[1]>numbers[2]) {
                System.out.println("Największa liczba w tej tablicy to : " + numbers[1]);
            }else
                System.out.println("Największa liczba w tej tablicy to : " + numbers[2]);
            break;

        }
        int[] numbers1 = {1, 2};
        int sum;
        sum = numbers1[0] + numbers1[1];
        System.out.println("\n" + numbers1[0] + "+" + numbers1[1]);
        System.out.println("Suma : " + sum);




    }

}






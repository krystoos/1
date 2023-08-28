package Methods;

public class Main {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int iloraz = a / b;
        int modulo = a % b;
        double msa = 3/4;
        System.out.println("msa" + msa);

        System.out.println("\n" + "Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + product);
        System.out.println("Iloraz : " + iloraz);
        System.out.println("Modulo : " + modulo);
        if (modulo==0){
            System.out.println("\n" + "Liczba -a- jest parzysta");
        }

        int c=7;
        int check1 = c%3;
        int check2 = c%5;
        if(check1%3==0 && check2%5==0){
            System.out.println("\n" + "Liczba -c- jest podzielna przez 3 i przed 5");
        }

        double d=3;
        double e=4;
        double result = Math.pow(d,e);
        System.out.println("\n" + "Liczba : " +d + " jest podniesiona do potęgi : " +e + " " + "\n" + "Co daje wynik równy : "
                +  result);

        double f=3;
        double result1=Math.sqrt(16);
        System.out.println("\n" + "Liczba : " + f);
        System.out.println("Pierwiastek kwadratowy podanej liczby jest równy : " + result1);

        double x=3;
        double y=4;
        double z=5;
        System.out.println("\n" + "Z:" +z + "\n" + "Y:" +y + "\n" +"X:" +x);
        if(x+y>z || x+z>y || z+y>x ){
            System.out.println("Z podanych 3 odcinków można zrobić trójkąt prostokątny");
        }else System.out.println("Niestety nie można utworzyć trójkąta prostokątnego z tych odcinków");
    }



}



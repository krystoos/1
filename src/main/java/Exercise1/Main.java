package Exercise1;

import java.util.Scanner;

    public class Main extends Account {
        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                Account account = new Account();
                System.out.println("Saldo początkowe: " + account.getBalance());
                System.out.println("Wprowadź kwotę wpłaty: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                System.out.println("Wprowadź kwotę wypłaty: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                System.out.println("Obecne saldo konta: " + account.getBalance());
                scanner.close();
            }catch (Exception e){
            }

        }
    }

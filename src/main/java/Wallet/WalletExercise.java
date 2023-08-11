package Wallet;

public class WalletExercise {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(3000);

        for (int i=1; i<=12;i++){
            System.out.println("Miesiąc : " + i);
            wallet.addMoney(4000);
            wallet.removeMoney(1000);
            wallet.removeMoney(1500);
            if(wallet.money>9000){
                wallet.removeMoney(5000);
                System.out.println("Spłata długów konsumenckich");

            }
            System.out.println("Stan konta po wypłacie");
            wallet.printAmount();

        }
        System.out.println(" Podsumowanie wydatków po  roku : "  );
        wallet.printAmount();

        if(wallet.money>10000){
            wallet.holidayTime(2500);
            System.out.println("Możesz lecieć na wakacje do Dubaju za 5000 ");
            wallet.printAmount();
        }else
            System.out.println("Niestety nie możesz lecieć na wakacje w tym roku");
    }
}

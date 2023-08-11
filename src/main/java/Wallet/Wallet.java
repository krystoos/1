package Wallet;

public class Wallet {
    float money;
    int holidayPrize;

     Wallet() {
        this.money = 3000;
        this.holidayPrize = 2200;
    }
    Wallet(float amount){
         this.money=amount;

    }

    public void addMoney(float amount){
        this.money+=amount;
    }

    public void removeMoney(float amount){
        this.money-=amount;
    }
    public void holidayTime(float amount){
         this.money-=amount;

    }
    public void printAmount(){
        System.out.println("Kwota w portfelu : " + this.money);
    }




    }





package Exercise1;

public class Account {
        private double balance = 0;

        Account(){
        }
        public Account(double balance) {
            this.balance = balance;
        }
        public void deposit(double value) {
            this.balance+=value;
        }
        public void withdraw(double value){
            if(value<balance) {
                this.balance -= value;
            }else
                System.out.println("Niewystarczające środki na koncie");
        }
        public double getBalance(){
            return this.balance;
        }
}

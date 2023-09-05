package HW;

public class Account {
    private double balance;
    public Account(){}

    public Account(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance){
        if(balance < 0.0){
            return;
        }
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
}

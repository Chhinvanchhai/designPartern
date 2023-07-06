public class Account {
    private float balance;

    public void setBalance(float balance){
        if(balance < 0){
            return;
        }
        this.balance = balance;
    }

    public  float getBalance(){
        return this.balance;
    }
    public void deposit(float amount){
        if(amount < 0){
            return;
        }
        this.balance += amount;
    }
    public void witdraw(float amount){
        if(amount < 0){
            return;
        }
        this.balance -= amount;
    }
}

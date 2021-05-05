public class Account {
    private int balance = 0;

    public int getBalance() {
        return this.balance;
    }

    public void depsit(int money) {
        this.balance = money;
    }

    public int withdraw(int money){
        if(this.balance < money) {
            return this.balance;
        }
        return this.balance -= money;
    }
}

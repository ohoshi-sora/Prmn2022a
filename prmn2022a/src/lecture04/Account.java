package lecture04;

public class Account {

    private String name;
    private String number;
    private long balance;

    Account(String name, String number){
        this.name = name;
        this.number = number;
        balance = 0;
    }

    public String getNumber(){
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}

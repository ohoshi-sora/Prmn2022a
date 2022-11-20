package lecture04;

public class Kadai42 {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.existsAccount("渡邊星空", "1220");
        atm.registerAccount("渡邊星空","1220");
        atm.existsAccount("渡邊星空","1220");
        atm.deposit("1220",100000);
        atm.withdraw("1220",50000);
        atm.withdraw("1220",100000);

    }
}

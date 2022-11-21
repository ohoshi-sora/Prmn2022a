package lecture04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ATM {

    ArrayList<Account> accountList = new ArrayList<>();

    public ATM(){
        List<Account> accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number){
        if(existsAccount(name, number)){
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
            accountList.add(new Account(name, number));
            System.out.print(name + " さんのアカウントを ");
            System.out.println("口座番号：" + number + " で登録しました。");
        }

    }

    public boolean existsAccount(String name, String number){
        return accountList.contains(name) && accountList.contains(number);
//        if(accountList.contains(name) && accountList.contains(number)){
//            return true;
//        }else{
//            return false;
//        }
    }

    public void deposit(String number, long money){
        for(Account account : accountList){
            if(Objects.equals(number, account.getNumber())){
                account.setBalance(money);
                System.out.println("口座番号：" + number + " に " + money + " 円入金しました。");
            }
        }
    }

    public long withdraw(String number, long money){
        for(Account account : accountList){
            if(Objects.equals(number, account.getNumber())){
                if(money <= account.getBalance()){
                    account.setBalance(account.getBalance() - money);
                    System.out.println("口座番号：" + number + " から " + money + " 円引き出しました。残高：" + account.getBalance() + " 円です。");
                }else{
                    System.out.println("口座番号：" + number + " から " + money + " 円引き出せませんでした。残高：" + account.getBalance() + " 円です。");
                    return 1;
                }
            }
        }
        return 0;
    }



}


package Synchronization;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 1000;

        Account account1 = new Account();

        Thread request1 = new NetBankingOne(account,200.0);
        Thread request2 = new NetBankingTwo(account1,300.0);

        request1.start(); request2.start();
    }
}
